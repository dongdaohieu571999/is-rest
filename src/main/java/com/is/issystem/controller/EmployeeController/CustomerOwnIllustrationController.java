package com.is.issystem.controller.EmployeeController;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import com.is.issystem.entities.ContractChangeHistory;
import com.is.issystem.entities.CustomerOwnIllustration;
import com.is.issystem.service.CustomerOwnIllustrationService;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/illustration"})
public class CustomerOwnIllustrationController {
    @Autowired
    CustomerOwnIllustrationService customerOwnIllustrationService;

    @PostMapping(value = "/get_all_campaign")
    public List<CustomerOwnIlustrationDTO> getAllCustomerOwnIllustration(@RequestBody String code_em_support){
        return customerOwnIllustrationService.getAllCustomerOwnIllustration(code_em_support);
    }
    @PostMapping(value = "/search_all_campaign")
    public List<CustomerOwnIlustrationDTO> searchAllCustomerOwnIllustration(@RequestBody String data){
        JSONObject datajsObject = new JSONObject(data);
        return customerOwnIllustrationService.searchAllCustomerOwnIllustration(datajsObject.getString("code_em_support"),datajsObject.getString("create_time"),datajsObject.getString("end_time"),datajsObject.getString("searchValue"));
    }

    @PostMapping(value = "/add_one_customer_own_illustration")
    public void addOneCustomerOwnIllustration(@RequestBody String data){
        JSONObject jsObject = new JSONObject(data);
         customerOwnIllustrationService.addOneCustomerOwnIllustration(jsObject.getString("code"),jsObject.getString("end_time"));
    }

}
