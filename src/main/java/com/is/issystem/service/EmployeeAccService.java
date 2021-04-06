package com.is.issystem.service;


import java.util.List;
import java.util.Optional;

import com.is.issystem.commons.Function;
import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.entities.EmployeeAcc;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.is.issystem.repository.entity_repository.EmployeeAccRepository;

import static com.is.issystem.service.TokenAuthenticationService.SECRET;
import static com.is.issystem.service.TokenAuthenticationService.TOKEN_PREFIX;

@Service
@Transactional(rollbackFor = Exception.class)
    public class EmployeeAccService {
        @Autowired
        public JavaMailSender emailSender;
        @Autowired
        private EmployeeAccRepository employeeAccRepository;

        public List<EmployeeAcc> findAll() {
            return employeeAccRepository.findAll();
        }

        public void addEmployeeAccount(EmployeeAcc employee_acc,String email) {
            Optional<EmployeeAcc> employeeAcc = employeeAccRepository.findById(employee_acc.getId());
            employeeAcc.get().setStatus(true);
            employeeAcc.get().setCode(employee_acc.getCode());
            employeeAcc.get().setId_role(employee_acc.getId_role());
            employeeAcc.get().setPass("");
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("THÔNG TIN TÀI KHOẢN NHÂN VIÊN");
            message.setText("Bạn vui lòng dùng thông tin bên dưới để đăng nhập vào tài khoản của bạn:\n"
            +"Tài Khoản: ");

            try{
                this.emailSender.send(message);
            } catch (MailException e){
                e.printStackTrace();
            }
            employeeAccRepository.save(employee_acc);
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
                EmployeeAcc employeeAcc = new EmployeeAcc();
                employeeAcc.setId_role(employeeAccRepository.getOneAcc(user).getId_role());
                return employeeAcc;
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

        public List<EmployeeAcc> getAllEmployeeByIdRole(Integer id_role){
            return employeeAccRepository.getAllEmaccByIdRole(id_role);
        }


    }

