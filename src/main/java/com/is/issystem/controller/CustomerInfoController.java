package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.service.CustomerInfoService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = {"/api/customer"})
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @PostMapping(value = "/get_all_customer_info")
    List<CustomerDTO> findAll(@RequestBody String code_em_support){
        return customerInfoService.findAll(code_em_support);
    }

    @GetMapping(value = "/get_all_customer_info_admin")
    List<CustomerDTO> getAllCustomerInfoAdmin(){
        return customerInfoService.getAllCustomerInfoAdmin();
    }

    @GetMapping(value = "/get_detail_customer_info_admin/{id}")
    public CustomerDTO getAllContractHistory(@PathVariable("id") int id){
        return customerInfoService.getOneInfo(id);
    }


    @PostMapping(value = "/update_one_customer_info")
    public ResponseEntity<?> updateOneCustomerInfo(@RequestBody CustomerDTO customerDTO){
        customerInfoService.updateCustomerInfo(customerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(customerDTO);

    }

    @PostMapping(value = "/add_customer_info")
    public ResponseEntity<?> addOneCustomerInfo(@RequestBody CustomerDTO customerDTO){
        customerInfoService.addCustomerInfo(customerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(customerDTO);
    }

    @PostMapping(value = "/get_one_customer_info")
    public ResponseEntity<?> getOneCustomerInfo(@RequestBody String data1){
        JSONObject data = new JSONObject(data1);
        return ResponseEntity.status(HttpStatus.OK).body(customerInfoService.getOneInfo( Integer.parseInt(data.get("id").toString()),Function.getCodeInTokenKey(data.get("token_key").toString())));
    }
}
