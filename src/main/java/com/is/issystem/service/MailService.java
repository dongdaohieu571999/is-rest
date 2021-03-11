package com.is.issystem.service;

import com.is.issystem.dto.MailDTO;
import com.is.issystem.repository.MailDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MailService {

    @Autowired
    private MailDTORepository mailDTORepository;

    public List<MailDTO> getAllMail(String userCode){
        return mailDTORepository.getAllMail(userCode);
    }

    public MailDTO getDetailMail(String userCode, Integer mailId){
        return mailDTORepository.getDetailMail(userCode, mailId);
    }

    public Integer addNewMail(String title, String senderNameCode, String receiverNameCode,
                              String content, Integer status, Integer priority){
        return mailDTORepository.addNewMail(title, senderNameCode, receiverNameCode, content, status, priority);
    }
}
