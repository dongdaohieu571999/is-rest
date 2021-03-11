package com.is.issystem.controller;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.ContractRequestDTO;
import com.is.issystem.service.ContractRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/contractRequest"})
public class ContractRequestController {
    @Autowired
    private ContractRequestService contractRequestService;

    @GetMapping(value = "/get_all_contract_request")
    List<ContractRequestDTO> getAllContractRequest(){
        return contractRequestService.getAllContractRequest();
    }
}
