package com.is.issystem.controller;
import com.is.issystem.entities.Request;
import com.is.issystem.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/request"})
public class RequestController {
    @Autowired
    private RequestService requestService;

    @GetMapping(value = "/get_all_request")
    List<Request> getAllContractRequest(){
        return requestService.getAllUncheckReq();
    }

    @GetMapping(value = "/get_all_request_approval")
    List<Request> getAllContractRequestApproval(){
        return requestService.getAllContractRequestApproval();
    }

    @PostMapping(value = "/get_detail_request")
    public ResponseEntity<?> getdetailRequest(@RequestBody Integer id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(requestService.getDetailRequest(id));
    }

    @PostMapping(value = "/add_one_request")
    public ResponseEntity<?> addOneRequest(@RequestBody Request request){
        return ResponseEntity.status(HttpStatus.OK).body(requestService.addOneReq(request));
    }
}
