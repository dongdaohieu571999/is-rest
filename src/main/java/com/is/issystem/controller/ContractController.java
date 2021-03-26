package com.is.issystem.controller;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.Contract;
import com.is.issystem.entities.ContractChangeHistory;
import com.is.issystem.entities.FeePaymentHistory;
import com.is.issystem.entities.IntersetPaymentHistory;
import com.is.issystem.repository.entity_repository.ContractRepository;
import com.is.issystem.service.ContractService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/api/contract"})
public class ContractController {
    @Autowired
    private ContractService contractService;
    private ContractRepository contractRepository;

    @GetMapping(value = "/get_all_contract")
    List<ContractDTO> getAllContract(){
        return contractService.getAllContract();
    }

    @GetMapping(value = "/get_all_contract_change_history/{id}")
    List<ContractChangeHistory> getAllContractHistory(@PathVariable("id") int id){
        return contractService.getAllContractHistory(id);
    }

    @PostMapping(value = "/set_active_contract")
    public ResponseEntity<?> setActiveContract(@RequestBody String data1){
        JSONObject data = new JSONObject(data1);
        contractService.setUpdateContract(Integer.parseInt(data.get("id_contract").toString()),Integer.parseInt(data.get("id_request").toString()),data.get("description").toString());
        return ResponseEntity.status(HttpStatus.OK).body(data1);
    }

    @PostMapping(value = "/set_decline_contract")
    public ResponseEntity<?> setDeclineContract(@RequestBody String data1){
        JSONObject data = new JSONObject(data1);
        contractService.setUpdateContractDecline(Integer.parseInt(data.get("id_contract").toString()),Integer.parseInt(data.get("id_request").toString()),data.get("description").toString());
        return ResponseEntity.status(HttpStatus.OK).body(data1);
    }

    @GetMapping(value = "/get_all_fee_payment_history/{id}")
    List<FeePaymentHistory> getAllFeePaymentHistory(@PathVariable("id") int id){
        return contractService.getAllFeePaymentHistory(id);
    }

    @GetMapping(value = "/get_all_interset_payment_history/{id}")
    List<IntersetPaymentHistory> getAllIntersetPaymentHistory(@PathVariable("id") int id){
        return contractService.getAllIntersetPaymentHistory(id);
    }
    @GetMapping(value = "/get_detail_contract/{id}")
    ContractDTO getDetailContract(@PathVariable("id") int id){
        return contractService.getDetailContract(id);
    }

    @GetMapping(value = "/get_detail_contract_change_history/{id}")
    Optional<ContractChangeHistory> getDetailContractChange(@PathVariable("id") int id){
        return contractService.getDetailContractChange(id);
    }

    @PostMapping(value = "/add_contract")
    public ResponseEntity<?> addContract(@RequestBody Contract contract){
        contractRepository.save(contract);
        return ResponseEntity.status(HttpStatus.OK).body(contract);
    }

    @PostMapping(value = "/edit_contract")
    public ResponseEntity<?> editContract(@RequestBody Contract contract){
        contractService.updateContract(contract);
        return ResponseEntity.status(HttpStatus.OK).body(contract);
    }
}
