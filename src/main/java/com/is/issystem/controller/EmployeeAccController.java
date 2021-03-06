package com.is.issystem.controller;

import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.entities.EmployeeInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.is.issystem.service.EmployeeAccService;
import java.util.List;

@RestController
@RequestMapping(value = {"/api/employee"})
public class EmployeeAccController {
    @Autowired
    private EmployeeAccService employeeAccService;

    @GetMapping(value = {"/get_all_employee_acc"})
    public ResponseEntity<?>  listEmployeeAccount(){
        List<EmployeeAcc> listAccEm = employeeAccService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listAccEm);
    }

    @PostMapping(value = "/add_employee_acc")
    public ResponseEntity<?> addEmployeeAccount(@RequestBody EmployeeAcc employee_acc){
        if(employeeAccService.checkExistEmployeeAccount(employee_acc)){
            return null;
        } else {
            employeeAccService.addEmployeeAccount(employee_acc);
            return ResponseEntity.status(HttpStatus.OK).body(employee_acc.getId());
        }
    }


    @PutMapping(value = "/update_employee_acc")
    public ResponseEntity<?> updateEmployeeAccount(EmployeeAcc employee_acc){
        employeeAccService.updateEmployeeAccount(employee_acc);
        return ResponseEntity.status(HttpStatus.OK).body(employee_acc);
    }

    @GetMapping(value = {"/get_one_employee_acc/{token_id}"})
    public ResponseEntity<?> getOneEmployeeAccount(@PathVariable String token_id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.findEmployeeAccountByCode(token_id));
    }
}
