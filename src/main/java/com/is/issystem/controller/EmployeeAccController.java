package com.is.issystem.controller;

import com.google.gson.Gson;
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
    public ResponseEntity<?> addEmployeeAccount(@RequestBody String data){
        JSONObject jsonObject = new JSONObject(data);
        Gson gson=new Gson();
        EmployeeAcc employeeAcc = gson.fromJson(jsonObject.getJSONObject("emAcc").toString(),EmployeeAcc.class);
        if(employeeAccService.checkExistEmployeeAccount(employeeAcc)){
            return null;
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.addEmployeeAccount(
                    employeeAcc,
                    jsonObject.getString("email"),
                    jsonObject.getString("code_suppervisor"),
                    jsonObject.getInt("id_custInfo")).getId());
        }
    }

    @PostMapping(value = "/get_all_employee_acc_by_idRole")
    public ResponseEntity<?> getAllEmaccByIdRole(@RequestBody Integer id_role){
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.getAllEmployeeByIdRole(id_role));
    }

    @PostMapping(value = "/update_employee_acc")
    public ResponseEntity<?> updateEmployeeAccount(@RequestBody EmployeeAcc employee_acc){
        employeeAccService.updateEmployeeAccountByCode(employee_acc);
        return ResponseEntity.status(HttpStatus.OK).body(employee_acc);
    }

    @GetMapping(value = {"/get_one_employee_acc/{token_id}"})
    public ResponseEntity<?> getOneEmployeeAccount(@PathVariable String token_id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeAccService.findEmployeeAccountByCode(token_id));
    }
}
