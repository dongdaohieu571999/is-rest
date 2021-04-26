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

            System.out.println("pauseEmployee(String codeEmployeeNew,Integer id_employee_old)");

            try{
                this.emailSender.send(message);
                System.out.println("pause successfully");
            } catch (MailException e){
                e.printStackTrace();
                System.out.println("pause unsuccessfully");
            }
            System.out.println("---------------");
        }

    public List<PauseReason> updatePauseReason(List<PauseReason> pauseReasons){
        for(PauseReason pauseReason : pauseReasons){
            pauseReasonHistoryRepository.save(pauseReason);
        }
        System.out.println("updatePauseReason(List<PauseReason> pauseReasons)");
        System.out.println(pauseReasons.toString());
        System.out.println("---------------");
        return pauseReasons;
    }

        public List<EmployeeAcc> findAll() {
            List<EmployeeAcc> result = employeeAccRepository.findAll();
            System.out.println("List<EmployeeAcc> findAll()");
            System.out.println(result.toString());
            System.out.println("---------------");
            return result;
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

            System.out.println("addEmployeeAccount(EmployeeAcc employee_acc,String email,String code_ap_support,Integer id_custInfo)");
            try{
                this.emailSender.send(message);
                System.out.println("add successfully");
            } catch (MailException e){
                e.printStackTrace();
                System.out.println("add unsuccessfully");
            }
            System.out.println("---------------");
        return employeeAcc;
        }


        public Optional<EmployeeAcc> findEmployeeAccountByID(Integer id) {
            Optional<EmployeeAcc> result = employeeAccRepository.findById(id);
            System.out.println("findEmployeeAccountByID(Integer id)");
            System.out.println(result.toString());
            System.out.println("---------------");
            return result;
        }

        public EmployeeAcc findEmployeeAccountByCode(String token_id) {
            System.out.println("findEmployeeAccountByCode(String token_id)");
            if (token_id != null) {
                String user = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token_id.replace(TOKEN_PREFIX, ""))
                        .getBody()
                        .getSubject();
                EmployeeAcc result = employeeAccRepository.getOneAcc(user);
                System.out.println(result.toString());
                System.out.println("---------------");
                return result;
            }
            System.out.println("---------------");
            return null;
        }

        public EmployeeAcc updateEmployeeAccountByCode(EmployeeAcc employee_acc) {
            EmployeeAcc existEmployeeAcc = employeeAccRepository.getOneAcc(employee_acc.getCode());
            existEmployeeAcc.setCode(employee_acc.getCode());
            existEmployeeAcc.setPass(employee_acc.getPass());
            existEmployeeAcc.setStatus(employee_acc.isStatus());
            EmployeeAcc result = employeeAccRepository.save(existEmployeeAcc);
            System.out.println("updateEmployeeAccountByCode(EmployeeAcc employee_acc)");
            System.out.println(result.toString());
            System.out.println("---------------");
            return result;
        }

    public EmployeeAcc updateEmployeeAccountById(EmployeeAcc employee_acc) {
        Optional<EmployeeAcc> existEmployeeAcc = employeeAccRepository.findById(employee_acc.getId());
        existEmployeeAcc.get().setCode(employee_acc.getCode());
        existEmployeeAcc.get().setPass(employee_acc.getPass());
        existEmployeeAcc.get().setStatus(employee_acc.isStatus());
        EmployeeAcc result = employeeAccRepository.save(existEmployeeAcc.get());
        System.out.println("updateEmployeeAccountById(EmployeeAcc employee_acc)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

        public boolean checkExistEmployeeAccount(EmployeeAcc employee_acc) {
            boolean result = employeeAccRepository.getOneAcc(employee_acc.getCode()) == null ?false:true;
            System.out.println("checkExistEmployeeAccount(EmployeeAcc employee_acc)");
            System.out.println(result);
            System.out.println("---------------");
            return result;
        }

        public List<EmployeeAcc> getAllEmployeeByIdRole(Integer id_role){
            List<EmployeeAcc> result = employeeAccRepository.getAllEmaccByIdRole(id_role);
            System.out.println("getAllEmployeeByIdRole(Integer id_role)");
            System.out.println(result.toString());
            System.out.println("---------------");
            return result;
        }


    }

