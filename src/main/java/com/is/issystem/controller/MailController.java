package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/all_mail/{tokenId}")
    public ResponseEntity<?> viewAllMail(@PathVariable String tokenID){
        String userCode = Function.getCodeInTokenKey(tokenID);
        return ResponseEntity.status(HttpStatus.OK).body(mailService.getAllMail(userCode));
    }

    @GetMapping("/view_detail_mail/{mailID}")
    public ResponseEntity<?> viewDetailMail(@PathVariable int mailID){
        return ResponseEntity.status(HttpStatus.OK).body(mailService.getDetailMail(mailID));
    }

}
