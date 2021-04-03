package com.is.issystem.controller;

import com.is.issystem.entities.Revenue;
import com.is.issystem.service.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/revenue/")
public class RevenueController {
    @Autowired
    RevenueService revenueService;

    @PostMapping(value = "/save_one_revenue")
    public ResponseEntity saveOneRevenue(@RequestBody Revenue revenue){
        return ResponseEntity.status(HttpStatus.OK).body(revenueService.saveOneRevenue(revenue));
    }
}
