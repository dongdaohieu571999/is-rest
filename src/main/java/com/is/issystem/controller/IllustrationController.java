package com.is.issystem.controller;

import com.is.issystem.dto.IllustrationItemOfList;
import com.is.issystem.entities.Illustration;
import com.is.issystem.dto.IllustrationDTO;
import com.is.issystem.service.IllustrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/illustration"})
public class IllustrationController {
    @Autowired
    private IllustrationService illustrationService;

    @GetMapping(value = "/get_all_illustration_belong_customer/{id}")
    List<IllustrationItemOfList> getAllIllustration(@PathVariable("id") int id){
        return illustrationService.getAllillstration(id);
    }

    @PostMapping(value = "/add_one_illustration")
    public void illustrationDTO (@RequestBody IllustrationDTO illustrationDTO){
//        if(illustrationService.checkExistIllustration(illustrationDTO)){
//            illustrationService.updateIllustration(illustrationDTO);
//        } else {
            illustrationService.saveIllustration(illustrationDTO);
//        }
    }
}
