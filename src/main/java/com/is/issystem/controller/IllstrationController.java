package com.is.issystem.controller;

import com.is.issystem.entities.ContractChangeHistory;
import com.is.issystem.entities.illstration;
import com.is.issystem.service.IllstrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/illustration"})
public class IllstrationController {
    @Autowired
    private IllstrationService illstrationService;

    @GetMapping(value = "/get_all_illustration_belong_customer/{id}")
    List<illstration> getAllContractHistory(@PathVariable("id") int id){
        return illstrationService.getAllillstration(id);
    }
}
