package com.is.issystem.controller.CustomerController;

import com.is.issystem.commons.Ultility;
import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.IllustrationDTO;
import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.entities.Referencetable;
import com.is.issystem.service.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api/customer-api"})
public class CustomerController {
    @Autowired
    ReferenceTableService referenceTableService;

    @Autowired
    ContractService contractService;

    @Autowired
    CustomerInfoService customerInfoService;

    @Autowired
    private CustomerAccService customerAccService;

    @Autowired
    private IllustrationService illustrationService;

    @PostMapping(value = "/login")
    public ResponseEntity<?> loginCustomer(@RequestBody CustomerAcc data){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token_customer",customerAccService.getAccountbyCodePass(data));
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject.toString());
    }

    @PostMapping(value = "/contract-list")
    public ResponseEntity<?> getAllContractForCust(@RequestBody Integer id_Cust_Info){
        return ResponseEntity.status(HttpStatus.OK).body(contractService.getAllContractForCustomer(id_Cust_Info));
    }

    @PostMapping(value = "/get_one_customer_info")
    public ResponseEntity<?> getOneCustomerInfoByIdCustomer(@RequestBody Integer id_cust_info){
        return ResponseEntity.status(HttpStatus.OK).body(customerInfoService.getOneInfo(id_cust_info));
    }

    @PostMapping(value = "/get_all_illustration_customer")
    public ResponseEntity<?> getAllIllustrationByIdCustomer(@RequestBody Integer id_cust_info){
        return ResponseEntity.status(HttpStatus.OK).body(illustrationService.getAllIllustration(id_cust_info));
    }

    @PostMapping(value = "/get_detail_illustration/")
    IllustrationDTO getDetailIllustration(@RequestBody Integer id){
        return illustrationService.getDetailIllustration(id);
    }

    // lấy chi tiết hợp đồng của khách hàng ở trang của khách hàng
    @PostMapping(value = "/get_detail_contract_for_customer")
    ContractDTO getDetailContract(@RequestBody Integer data){
        return contractService.getDetailContractForCustomer(data);
    }

    @PostMapping(value = "/get_all_reference_table")
    public ResponseEntity<?> getAllReference(@RequestBody String token){
        if(Ultility.getCodeInTokenKey(token)!=null){
            return ResponseEntity.status(HttpStatus.OK).body(new Referencetable(referenceTableService.findAllMultiplierForAge(),
                    referenceTableService.findAllMultiplierForCareerGroup(),referenceTableService.findAllMultiplierForGenders()
                    , referenceTableService.findAllMultiplierForMainInterest(),referenceTableService.findAllMultiplierForPaymentPeriod()
                    ,referenceTableService.findAllMultiplierForSubInterests()));
        }
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
