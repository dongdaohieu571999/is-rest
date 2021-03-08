package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import com.is.issystem.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = {"/api/customer"})
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @GetMapping(value = "/get_all_customer_info")
    List<CustomerDTO> findAll(){
        return customerInfoService.findAll();

    }

    @GetMapping(value = "/get_detail_customer_info")
    CustomerDTO getCustomerDetail(int id){
        return customerInfoService.getCustomerDetail(id);

    }

    @PostMapping(value = "/update_one_customer_info")
    public ResponseEntity<?> updateOneCustomerInfo(@RequestBody CustomerDTO customerDTO){
        customerInfoService.updateCustomerInfo(customerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(customerDTO);
    }

    @GetMapping(value = "/get_one_customer_info")
    public ResponseEntity<?> getOneCustomerInfo(@PathVariable("id") Integer id,@PathVariable("token_key") String token_key){
        String code = Function.getCodeInTokenKey(token_key);
        return ResponseEntity.status(HttpStatus.OK).body(customerInfoService.getOneInfo(id,code));
    }
}
