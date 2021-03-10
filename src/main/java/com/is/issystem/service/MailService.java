package com.is.issystem.service;

import com.is.issystem.dto.MailDTO;
import com.is.issystem.entities.Mail;
import com.is.issystem.repository.MailDTORepository;
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

    @Autowired
    private MailDTORepository mailDTORepository;

    public List<Mail> getAllMail(String userCode){
        return mailRepository.getAllMail(userCode);
    }

    public MailDTO getDetailMail(Integer mailId){
        return mailDTORepository.getDetailMail(mailId);
    }
}
