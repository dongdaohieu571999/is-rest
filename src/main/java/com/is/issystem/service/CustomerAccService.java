package com.is.issystem.service;


import com.is.issystem.commons.Ultility;
import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.repository.entity_repository.CustomerAccRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerAccService {
    @Autowired
    public JavaMailSender emailSender;
    @Autowired
    private CustomerAccRepository customerAccRepository;
    @Autowired
    private CustomerInfoService customerInfoService;

    static final long EXPIRATIONTIME = 864_000_000; // 10 days
    static final String SECRET = "ThisIsASecret";
    static final String TOKEN_PREFIX = "Bearer";

    
    public List<CustomerAcc> findAll(){
        List<CustomerAcc> result = customerAccRepository.findAll();
        System.out.println("List<CustomerAcc> findAll()");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public void addCustomerAccount(CustomerAcc customerAcc){
        customerAccRepository.save(customerAcc);
        System.out.println("addCustomerAccount(CustomerAcc customerAcc)");
        System.out.println("add customer successfully");
        System.out.println("---------------");
    }

    public CustomerAcc sendCustomerAccount(Integer id){
        List<CustomerDTO> customerInfo = customerInfoService.getOneInfo(id);
        Optional<CustomerAcc> customerAcc = customerAccRepository.findById(customerInfo.get(0).getId_account().intValue());
        customerAcc.get().setStatus(true);
        customerAccRepository.save(customerAcc.get());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(customerInfo.get(0).getEmail());
        message.setSubject("THÔNG TIN TÀI KHOẢN KHÁCH HÀNG");
        message.setText("Dưới đây là tài khoản và mật khẩu đăng nhập của Quý Khách:\nMã Đăng Nhập: " + customerAcc.get().getCode() + "\n" +
                "Mật Khẩu Đăng Nhập: "+customerAcc.get().getPass() + "\nQuý Khách vui lòng dùng thông tin trên để đăng nhập tài khoản của mình, cảm ơn quý khách ! ");

        try{
            this.emailSender.send(message);
        } catch (MailException e){
            e.printStackTrace();
        }
        CustomerAcc result = customerAcc.get();
        System.out.println("sendCustomerAccount(Integer id)");
        System.out.println("send customer account success");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public CustomerAcc resetAccountPasswordCustomer(CustomerDTO customerDTO){
        Optional<CustomerAcc> customerAcc = customerAccRepository.findById(customerDTO.getId_account().intValue());
        customerAcc.get().setPass(Ultility.generatePassword(8));
        CustomerAcc customerAcc1 = customerAccRepository.save(customerAcc.get());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(customerDTO.getEmail());
        message.setSubject("THÔNG TIN MẬT KHẨU ĐĂNG NHẬP");
        message.setText("QUÝ KHÁCH ĐÃ YÊU CẦU ĐẶT LẠI MẬT KHẨU,\nDưới đây là tài khoản và mật khẩu đăng nhập của Quý Khách:\nMã Đăng Nhập: " + customerAcc1.getCode() + "\n" +
                "Mật Khẩu Đăng Nhập: "+customerAcc1.getPass() + "\nQuý Khách vui lòng dùng thông tin trên để đăng nhập tài khoản của mình, cảm ơn quý khách ! ");
        try{
            this.emailSender.send(message);
        } catch (MailException e){
            e.printStackTrace();
        }
        System.out.println("resetAccountPasswordCustomer(CustomerDTO customerDTO)");
        System.out.println("reset password success");
        System.out.println(customerAcc1.toString());
        System.out.println("---------------");
        return customerAcc1;
    }

    public CustomerAcc updateCustomerAccount(CustomerAcc customerAcc){
        Optional<CustomerAcc> acc = customerAccRepository.findById(customerAcc.getId());
        acc.get().setCode(customerAcc.getCode());
        acc.get().setPass(customerAcc.getPass());
        acc.get().setStatus(customerAcc.isStatus());
        System.out.println("updateCustomerAccount(CustomerAcc customerAcc)");
        System.out.println("update successfully");
        System.out.println("---------------");
        return customerAccRepository.save(acc.get());
    }

    public boolean checkExistCustomerAccount(CustomerAcc customerAcc){
        boolean result = customerAccRepository.getAccExist(customerAcc.getCode(),customerAcc.getId()).size() > 0 ? true : false;
        System.out.println("checkExistCustomerAccount(CustomerAcc customerAcc)");
        System.out.println(result);
        System.out.println("---------------");
        return result;
    }

    public CustomerAcc checkExistCustomerAccountByIdPass(String data[]){
        CustomerAcc result = customerAccRepository.getAccByIdPass(Integer.parseInt(data[0]),data[1]);
        System.out.println("checkExistCustomerAccountByIdPass(String data[])");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public String getAccountbyCodePass(CustomerAcc customerAcc){
        String JWToken = null;
        String result = customerAccRepository.getAccByCodePass(customerAcc.getCode(),customerAcc.getPass());
        if(result!=null){
            JWToken = Jwts.builder()
                .setSubject(result)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        }
        System.out.println("getAccountbyCodePass(CustomerAcc customerAcc)");
        System.out.println(JWToken);
        System.out.println("---------------");
        return JWToken;
    }
}
