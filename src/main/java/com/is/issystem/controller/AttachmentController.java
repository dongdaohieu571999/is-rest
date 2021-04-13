package com.is.issystem.controller;

import com.is.issystem.entities.CustomerAttachment;
import com.is.issystem.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/attachment")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping(value = "/get_customer_attachment")
    public ResponseEntity<?> getCustomerAttachment(@RequestBody Integer id_contract){
        return ResponseEntity.status(HttpStatus.OK).body(attachmentService.getCustomerAttachment(id_contract));
    }

    @PostMapping(value = "/save_customer_attachment")
    public ResponseEntity<?> saveCustomerAttachment(@RequestBody List<CustomerAttachment> customerAttachments){
        return ResponseEntity.status(HttpStatus.OK).body(attachmentService.updateAttachment(customerAttachments));
    }
}