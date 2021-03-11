package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.dto.MailDTO;
import com.is.issystem.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/all_mail/{token_key}")
    public ResponseEntity<?> viewAllMail(@PathVariable String token_key){
        String userCode = Function.getCodeInTokenKey(token_key);
        return ResponseEntity.status(HttpStatus.OK).body(mailService.getAllMail(userCode));
    }

    @GetMapping("/view_detail_mail/{mailId}/{token_key}")
    public ResponseEntity<?> viewDetailMail(@PathVariable("mailId") int mailID, @PathVariable("token_key") String token_key){
        String userCode = Function.getCodeInTokenKey(token_key);
        return ResponseEntity.status(HttpStatus.OK).body(mailService.getDetailMail(userCode, mailID));
    }

    @PostMapping("/add_mail/{token_key}")
    public ResponseEntity<?> addNewMail(@PathVariable("token_key") String token_key, @RequestBody MailDTO mail){
        String userCode = Function.getCodeInTokenKey(token_key);
        System.out.println(mail.toString());
        mailService.addNewMail(mail.getTitle(),
                userCode,
                mail.getReceiverName(),
                mail.getContent(),
                1,
                1);
        return ResponseEntity.status(HttpStatus.OK).body(mail);
    }
}
