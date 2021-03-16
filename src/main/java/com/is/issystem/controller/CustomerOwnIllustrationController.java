package com.is.issystem.controller;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import com.is.issystem.entities.CustomerOwnIllustration;
import com.is.issystem.service.CustomerOwnIllustrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/illustration"})
public class CustomerOwnIllustrationController {
    @Autowired
    CustomerOwnIllustrationService customerOwnIllustrationService;

    @GetMapping(value = "/get_all_customer_own_illustration")
    public List<CustomerOwnIlustrationDTO> getAllCustomerOwnIllustration(){
        return customerOwnIllustrationService.getAllCustomerOwnIllustration();
    }

    @PostMapping(value = "/add_one_customer_own_illustration")
    public void addOneCustomerOwnIllustration(@RequestBody String code){
         customerOwnIllustrationService.addOneCustomerOwnIllustration(code);
    }

}
