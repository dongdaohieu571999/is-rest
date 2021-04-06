package com.is.issystem.controller;

import com.is.issystem.entities.EmployeeAcc;
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
    public ResponseEntity<?> addEmployeeAccount(@RequestBody String data){
        JSONObject jsonObject = new JSONObject(data);
        if(employeeAccService.checkExistEmployeeAccount((EmployeeAcc) jsonObject.get("emAcc"))){
            return null;
        } else {
            employeeAccService.addEmployeeAccount((EmployeeAcc) jsonObject.get("emAcc"),jsonObject.getString("email"));
            return ResponseEntity.status(HttpStatus.OK).body(((EmployeeAcc) jsonObject.get("emAcc")).getId());
        }
    }

    @PostMapping(value = "/get_all_employee_acc_by_idRole")
    public ResponseEntity<?> getAllEmaccByIdRole(@RequestBody Integer id_role){
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.getAllEmployeeByIdRole(id_role));
    }

    @PutMapping(value = "/update_employee_acc")
    public ResponseEntity<?> updateEmployeeAccount(EmployeeAcc employee_acc){
        employeeAccService.updateEmployeeAccountByCode(employee_acc);
        return ResponseEntity.status(HttpStatus.OK).body(employee_acc);
    }

    @GetMapping(value = {"/get_one_employee_acc/{token_id}"})
    public ResponseEntity<?> getOneEmployeeAccount(@PathVariable String token_id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.findEmployeeAccountByCode(token_id));
    }
}
