package com.is.issystem.controller;

import com.is.issystem.commons.Function;
import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.ContractListDTO;
import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.Contract;
import com.is.issystem.repository.ContractRepository;
import com.is.issystem.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/contract"})
public class ContractController {
    @Autowired
    private ContractService contractService;
    private ContractRepository contractRepository;

    @GetMapping(value = "/get_all_contract/{token_key}")
    List<ContractListDTO> getAllContract(@PathVariable("token_key") String token_key){
        String employeeCode = Function.getCodeInTokenKey(token_key);
        return contractService.getAllContract(employeeCode);
    }

    @GetMapping(value = "/get_detail_contract/{id}")
    ContractDTO getDetailContract(@PathVariable("id") int id){
        return contractService.getDetailContract(id);
    }

    @PostMapping(value = "/add_contract")
    public ResponseEntity<?> addContract(@RequestBody Contract contract){
        contractRepository.save(contract);
        return ResponseEntity.status(HttpStatus.OK).body(contract);
    }
}
