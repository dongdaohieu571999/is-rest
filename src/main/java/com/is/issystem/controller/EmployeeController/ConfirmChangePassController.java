package com.is.issystem.controller.EmployeeController;

import com.is.issystem.commons.Ultility;
import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.service.EmployeeAccService;
import com.is.issystem.service.FogotPasswordService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
public class ConfirmChangePassController {
    @Autowired
    public FogotPasswordService fogotPasswordService;
    @Autowired
    public EmployeeAccService employeeAccService;
    @PostMapping("/api/sendSimpleEmail")
    public ResponseEntity sendSimpleEmail(@RequestBody String data) throws IOException {
        return ResponseEntity.status(HttpStatus.OK).body(fogotPasswordService.sendSimpleEmail(data));

    }

    @PostMapping("/api/changePassword")
    public ResponseEntity<?> changePassword(@RequestBody String data){
        JSONObject jsonObject = new JSONObject(data);
        EmployeeAcc employeeAcc = new EmployeeAcc();
        employeeAcc.setPass(jsonObject.get("password").toString());
        employeeAcc.setStatus(true);
        employeeAcc.setCode(Ultility.getCodeInTokenKey(jsonObject.get("token_key").toString()));
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.updateEmployeeAccountByCode(employeeAcc));
    }
}
