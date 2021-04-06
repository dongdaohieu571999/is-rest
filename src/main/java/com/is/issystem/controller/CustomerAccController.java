package com.is.issystem.controller;

import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.service.CustomerAccService;
import com.is.issystem.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/api/customer"})
public class CustomerAccController {
    @Autowired
    private CustomerAccService customerAccService;
    @Autowired
    private CustomerInfoService customerInfoService;

    @PostMapping(value = "/send_acc_for_customer")
    public ResponseEntity<?> sendCustomerAccount(@RequestBody Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(customerAccService.sendCustomerAccount(id));
    }

    @PostMapping(value = "/add_customer_acc")
    public ResponseEntity<?> addCustomerAccount(@RequestBody CustomerAcc customerAcc){
        if(customerAccService.checkExistCustomerAccount(customerAcc)){
            return null;
        } else {
            customerAccService.addCustomerAccount(customerAcc);
            return ResponseEntity.status(HttpStatus.OK).body(customerAcc.getId());
        }
    }

    @PostMapping(value = "/update_customer_acc")
    public ResponseEntity<?> updateCustomerAccount(@RequestBody CustomerAcc customerAcc){
        boolean ahihi = customerAccService.checkExistCustomerAccount(customerAcc);
        if(customerAccService.checkExistCustomerAccount(customerAcc)){
            return null;
        } else {
            customerAccService.updateCustomerAccount(customerAcc);
            return ResponseEntity.status(HttpStatus.OK).body(customerAcc.getId());
        }
    }

}
