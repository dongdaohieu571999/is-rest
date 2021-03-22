package com.is.issystem.controller;

import com.is.issystem.service.MainInterestService;
import com.is.issystem.service.SubInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/interest/")
public class InterestController {

    @Autowired
    MainInterestService mainInterestService;

    @Autowired
    SubInterestService subInterestService;

    @GetMapping(value = "/get_all_main_interest")
    public ResponseEntity<?> getAllMainInterest(){
        return ResponseEntity.status(HttpStatus.OK).body(mainInterestService.getAllMainInterst());
    }

    @GetMapping(value = "/get_all_sub_interest")
    public ResponseEntity<?> getAllSubInterest(){
        System.out.println(subInterestService.getAllSubInterest());
        return ResponseEntity.status(HttpStatus.OK).body(subInterestService.getAllSubInterest());
    }
}
