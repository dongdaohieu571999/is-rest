package com.is.issystem.controller;

import com.is.issystem.entities.CustomerInfo;
import com.is.issystem.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = {"/customer"})
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @GetMapping(value = "/get_all_customer_info")
    List<CustomerInfo> findAll(){
        return customerInfoService.findAll();
    }
}
