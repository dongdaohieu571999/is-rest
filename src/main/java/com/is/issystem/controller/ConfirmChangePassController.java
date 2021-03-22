package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.service.EmployeeAccService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConfirmChangePassController {
    @Autowired
    public JavaMailSender emailSender;
    @Autowired
    public EmployeeAccService employeeAccService;
    @PostMapping("/api/sendSimpleEmail")
    public void sendSimpleEmail(@RequestBody String data) throws MailException {
        JSONObject jsonObject = new JSONObject(data);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(jsonObject.get("email").toString());
        message.setSubject("YÊU CẦU THAY ĐỔI MẬT KHẨU");
        message.setText("Để được cấp lại mật khẩu, quý khách vui lòng đi tới đường dẫn sau để" +
                " thay đổi mật khẩu: http://localhost:4200/confirm-change-pass?active_key="+jsonObject.get("token_key").toString()+", cảm ơn quý khách ! ");

        try{
            this.emailSender.send(message);
        } catch (MailException e){
            e.printStackTrace();
        }

    }

    @PostMapping("/api/changePassword")
    public ResponseEntity<?> changePassword(@RequestBody String data){
        JSONObject jsonObject = new JSONObject(data);
        EmployeeAcc employeeAcc = new EmployeeAcc();
        employeeAcc.setPass(jsonObject.get("password").toString());
        employeeAcc.setStatus(true);
        employeeAcc.setCode(Function.getCodeInTokenKey(jsonObject.get("token_key").toString()));
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.updateEmployeeAccount(employeeAcc));
    }
}
