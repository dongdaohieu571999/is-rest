package com.is.issystem.service;


import java.util.List;
import java.util.Optional;

import com.is.issystem.commons.Ultility;
import com.is.issystem.entities.*;
import com.is.issystem.repository.entity_repository.*;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.is.issystem.service.TokenAuthenticationService.SECRET;
import static com.is.issystem.service.TokenAuthenticationService.TOKEN_PREFIX;

@Service
@Transactional(rollbackFor = Exception.class)
    public class EmployeeAccService {
        @Autowired
        public JavaMailSender emailSender;
        @Autowired
        private EmployeeAccRepository employeeAccRepository;
        @Autowired
        private EmployeeInfoRepository employeeInfoRepository;
        @Autowired
        private ContractRepository contractRepository;
        @Autowired
        private CustomerInfoRepository customerInfoRepository;
        @Autowired
        private PauseReasonHistoryRepository pauseReasonHistoryRepository;

        public void pauseEmployee(String codeEmployeeNew,Integer id_employee_old){
            String codeEmployeeOld =  employeeAccRepository.findById(id_employee_old).get().getCode();
            String email = employeeInfoRepository.getOneEmployeeInfo(id_employee_old).getEmail();

            customerInfoRepository.updateEmployeeSupportCustomerInfo(codeEmployeeNew,codeEmployeeOld);
            contractRepository.updateEmployeeSupportContract(codeEmployeeNew,codeEmployeeOld);

            employeeAccRepository.updateStatusEmployeeAcc(codeEmployeeOld);

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("[THÔNG BÁO TẠM NGƯNG TÀI KHOẢN NHÂN VIÊN]");
            message.setText("Do bạn đã vi phạm một số quy định của công ty  " +
                    "nên tài khoản của bạn đã bị tạm ngưng." +
                    "Mọi thắc mắc thì xin hay liên hệ với email sau đây : daohieu571999@gmail.com");
            try{
                this.emailSender.send(message);
            } catch (MailException e){
                e.printStackTrace();
            }
        }

    public List<PauseReason> updatePauseReason(List<PauseReason> pauseReasons){
        for(PauseReason pauseReason : pauseReasons){
            pauseReasonHistoryRepository.save(pauseReason);
        }
        return pauseReasons;
    }

        public List<EmployeeAcc> findAll() {
            return employeeAccRepository.findAll();
        }

        public EmployeeAcc addEmployeeAccount(EmployeeAcc employee_acc,String email,String code_ap_support,Integer id_custInfo) {
            // lưu tài khoản của nhân viên
            EmployeeAcc employeeAcc = new EmployeeAcc();
            employeeAcc.setStatus(true);
            employeeAcc.setCode(employee_acc.getCode());
            employeeAcc.setId_role(employee_acc.getId_role());
            employeeAcc.setPass(Ultility.generatePassword(8));
            employeeAccRepository.save(employeeAcc);

            // thêm code của người giám sát cho nhân viên
            Optional<EmployeeInfo> employeeInfo = employeeInfoRepository.findById(id_custInfo);
            employeeInfo.get().setCode_ap_support(code_ap_support);
            employeeInfoRepository.save(employeeInfo.get());

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("THÔNG TIN TÀI KHOẢN NHÂN VIÊN");
            message.setText("Bạn vui lòng dùng thông tin bên dưới để đăng nhập vào tài khoản của bạn:\n"
            +"Tài Khoản: "+employee_acc.getCode()+"\n"
            +"Mật Khẩu: "+employeeAcc.getPass());

            try{
                this.emailSender.send(message);
            } catch (MailException e){
                e.printStackTrace();
            }
        return employeeAcc;
        }


        public Optional<EmployeeAcc> findEmployeeAccountByID(Integer id) {
            return employeeAccRepository.findById(id);
        }

        public EmployeeAcc findEmployeeAccountByCode(String token_id) {
            if (token_id != null) {
                String user = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token_id.replace(TOKEN_PREFIX, ""))
                        .getBody()
                        .getSubject();
                return employeeAccRepository.getOneAcc(user);
            }
            return null;
        }

        public EmployeeAcc updateEmployeeAccountByCode(EmployeeAcc employee_acc) {
            EmployeeAcc existEmployeeAcc = employeeAccRepository.getOneAcc(employee_acc.getCode());
            existEmployeeAcc.setCode(employee_acc.getCode());
            existEmployeeAcc.setPass(employee_acc.getPass());
            existEmployeeAcc.setStatus(employee_acc.isStatus());
            return employeeAccRepository.save(existEmployeeAcc);
        }

    public EmployeeAcc updateEmployeeAccountById(EmployeeAcc employee_acc) {
        Optional<EmployeeAcc> existEmployeeAcc = employeeAccRepository.findById(employee_acc.getId());
        existEmployeeAcc.get().setCode(employee_acc.getCode());
        existEmployeeAcc.get().setPass(employee_acc.getPass());
        existEmployeeAcc.get().setStatus(employee_acc.isStatus());
        return employeeAccRepository.save(existEmployeeAcc.get());
    }

        public boolean checkExistEmployeeAccount(EmployeeAcc employee_acc) {
            return employeeAccRepository.getOneAcc(employee_acc.getCode()) == null ?false:true;
        }

        public List<EmployeeAcc> getAllEmployeeByIdRoleCodeApSpp(Integer id_role, String code_app_support){
            if(code_app_support.isEmpty()){
                return employeeAccRepository.getAllEmaccByIdRole(id_role);
            }
            return employeeAccRepository.getAllEmaccByIdRoleCodeApSpp(id_role,code_app_support);
        }


    }

