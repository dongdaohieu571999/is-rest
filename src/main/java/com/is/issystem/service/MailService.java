package com.is.issystem.service;

import com.is.issystem.entities.Mail;
import com.is.issystem.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MailService {

    @Autowired
    private MailRepository mailRepository;

    public List<Mail> getAllMail(){
        return mailRepository.getAllMail();
    }

    public List<Mail> getAllMails(){
        return  mailRepository.findAll();
    }
}
