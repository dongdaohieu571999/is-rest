package com.is.issystem.controller;

import com.is.issystem.dto.ContractRequestDTO;
import com.is.issystem.dto.DetailRequestDTO;
import com.is.issystem.service.ContractRequestService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/request"})
public class RequestController {
    @Autowired
    private ContractRequestService contractRequestService;

    @GetMapping(value = "/get_all_request")
    List<ContractRequestDTO> getAllContractRequest(){
        return contractRequestService.getAllContractRequest();
    }

    @GetMapping(value = "/get_all_request_approval")
    List<ContractRequestDTO> getAllContractRequestApproval(){
        return contractRequestService.getAllContractRequestApproval();
    }


    //    @GetMapping(value = "/get_detail_contract_request")
//    DetailRequestDTO getDetailContractRequest()
//    {
//        return contractRequestService.getDetailRequest();
//    }
    @PostMapping(value = "/get_detail_request")
    public ResponseEntity<?> getOneCustomerInfo(@RequestBody String data1)
    {
        JSONObject data = new JSONObject(data1);
        DetailRequestDTO detailRequestDTO = contractRequestService.getDetailRequest( Integer.parseInt(data.get("id").toString()));
        return ResponseEntity.status(HttpStatus.OK).body(contractRequestService.getDetailRequest( Integer.parseInt(data.get("id").toString())));
    }
}
