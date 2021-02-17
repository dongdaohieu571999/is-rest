package com.is.issystem.controller;

import com.is.issystem.entities.EmployeeAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.is.issystem.service.EmployeeAccService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/employee"})
public class EmployeeAccController {
    @Autowired
    private EmployeeAccService employeeAccService;

    @GetMapping(value = {"/get_all_employee_acc"})
    public List<EmployeeAcc> listEmployeeAccount(){
        return employeeAccService.findAll();
    }

    @PostMapping(value = "/add_employee_acc")
    public void addEmployeeAccount(@RequestBody EmployeeAcc employee_acc){
        if(employeeAccService.checkExistEmployeeAccount(employee_acc)){
            return;
        } else {
            employeeAccService.addEmployeeAccount(employee_acc);
        }
    }

    @PutMapping(value = "/update_employee_acc")
    public void updateEmployeeAccount(EmployeeAcc employee_acc){
        employeeAccService.updateEmployeeAccount(employee_acc);
    }

    @GetMapping(value = {"/get_one_employee_acc/{id}"})
    public Optional<EmployeeAcc> getOneEmployeeAccount(@PathVariable int id){
        return employeeAccService.findEmployeeAccountByID(id);
    }
}
