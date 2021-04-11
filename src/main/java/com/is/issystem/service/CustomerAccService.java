package com.is.issystem.service;


import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.repository.entity_repository.CustomerAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    
    public List<CustomerAcc> findAll(){
        return customerAccRepository.findAll();
    }

    public void addCustomerAccount(CustomerAcc customerAcc){
        customerAccRepository.save(customerAcc);
    }

    public CustomerAcc sendCustomerAccount(Integer id){
        List<CustomerDTO> customerInfo = customerInfoService.getOneInfo(id);
        CustomerAcc customerAcc = customerAccRepository.getAcc(customerInfo.get(0).getId_account());
        customerAcc.setStatus(true);
        customerAccRepository.save(customerAcc);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(customerInfo.get(0).getEmail());
        message.setSubject("THÔNG TIN TÀI KHOẢN KHÁCH HÀNG");
        message.setText("Dưới đây là tài khoản và mật khẩu đăng nhập của Quý Khách:\nMã Đăng Nhập: " + customerAcc.getCode() + "\n" +
                "Mật Khẩu Đăng Nhập: "+customerAcc.getPass() + "\nQuý Khách vui lòng dùng thông tin trên để đăng nhập tài khoản của mình, cảm ơn quý khách ! ");

        try{
            this.emailSender.send(message);
        } catch (MailException e){
            e.printStackTrace();
        }
        return customerAccRepository.getAcc(customerInfo.get(0).getId_account());
    }

    public void updateCustomerAccount(CustomerAcc customerAcc){
        Optional<CustomerAcc> acc = customerAccRepository.findById(customerAcc.getId());
        acc.get().setCode(customerAcc.getCode());
        acc.get().setPass(customerAcc.getPass());
        acc.get().setStatus(customerAcc.isStatus());
        customerAccRepository.save(acc.get());
    }

    public void findCustomerAccountById(Integer id){
        customerAccRepository.findById(id);
    }

    public boolean checkExistCustomerAccount(CustomerAcc customerAcc){
        return customerAccRepository.getAccExist(customerAcc.getCode(),customerAcc.getId()).size() > 0 ? true : false;
    }
}
