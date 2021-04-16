package com.is.issystem.service;

import com.is.issystem.commons.Ultility;
import com.is.issystem.dto.EmployeeInfoDTO;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class FogotPasswordService {
    @Autowired
    public JavaMailSender emailSender;
    @Autowired
    public EmployeeInfoService employeeInfoService;
    public EmployeeInfoDTO sendSimpleEmail(String data) throws MailException{
        JSONObject jsonObject = new JSONObject(data);
        SimpleMailMessage message = new SimpleMailMessage();

        EmployeeInfoDTO employeeDTO = employeeInfoService.getAllEmployee().stream().
                filter(em -> em.getEmail().equalsIgnoreCase(jsonObject.get("email").toString())).findAny().orElse(null);

        if(employeeDTO != null){
            message.setTo(jsonObject.get("email").toString());
            message.setSubject("YÊU CẦU THAY ĐỔI MẬT KHẨU");
            message.setText("Để được cấp lại mật khẩu, quý khách vui lòng đi tới đường dẫn sau để" +
                    " thay đổi mật khẩu: http://localhost:4200/confirm-change-pass?active_key="+ Ultility.generateTokenKey(employeeDTO.getCode())+", cảm ơn quý khách ! ");

            try{
                this.emailSender.send(message);
                return employeeDTO;
            } catch (MailException e){
                e.printStackTrace();
            }
        } else {
            return null;
        }


        return employeeDTO;
    }
}
