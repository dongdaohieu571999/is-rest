package com.is.issystem.controller;

import com.is.issystem.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/")
    public ResponseEntity<?> viewAllMail(){
        return ResponseEntity.status(HttpStatus.OK).body(mailService.getAllMails());
    }

}
