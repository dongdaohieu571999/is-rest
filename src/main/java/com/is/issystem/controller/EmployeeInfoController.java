package com.is.issystem.controller;

import com.is.issystem.entities.EmployeeInfo;
import com.is.issystem.dto.EmployeeDTO;
import com.is.issystem.repository.EmployeeInfoAccRepository;
import com.is.issystem.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = {"/employee"})
public class EmployeeInfoController {
    @Autowired
    private EmployeeInfoService employeeInfoService;

    @GetMapping(value = {"/get_all_employee_info"})
    public List<EmployeeInfo> listEmployeeInfo(){
        return employeeInfoService.findAll();
    }

    @GetMapping(value = {"/get_all_employee_info_acc"})
    public List<EmployeeDTO> getListEmployeeInfoAcc(){
     return employeeInfoService.getAllEmployee();
    }

    @PostMapping(value = "/add_employee_info")
    public void addEmployeeInfo(@RequestBody EmployeeInfo employeeInfo){
//        if(employeeInfoService.checkExistEmployeeInfo(employeeInfo)){
//            return;
//        } else {
//            employeeInfoService.addEmployeeInfo(employeeInfo);
//        }
        employeeInfoService.addEmployeeInfo(employeeInfo);
    }

    @PutMapping(value = "/update_employee_info")
    public void updateEmployeeInfo(EmployeeInfo employeeInfo){
        employeeInfoService.updateEmployeeInfo(employeeInfo);
    }

    @GetMapping(value = {"/get_one_employee_info/{id}"})
    public Optional<EmployeeInfo> getOneEmployeeInfo(@PathVariable int id){
        return employeeInfoService.findEmployeeInfoByID(id);
    }
}
