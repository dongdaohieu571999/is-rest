package com.is.issystem.controller;

import com.is.issystem.dto.EmployeeInfoDTO;
import com.is.issystem.entities.EmployeeInfo;
import com.is.issystem.dto.EmployeeDTO;
import com.is.issystem.repository.EmployeeInfoAccRepository;
import com.is.issystem.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/api/employee"})
public class EmployeeInfoController {
    @Autowired
    EmployeeInfoService employeeInfoService;

//    @GetMapping(value = {"/get_all_employee_info"})
//    public List<EmployeeInfo> listEmployeeInfo(){
//        return employeeInfoService.findAll();
//    }

    @GetMapping(value = {"/get_all_employee_info_acc"})
    public List<EmployeeDTO> getListEmployeeInfoAcc(){
     return employeeInfoService.getAllEmployee();
    }

    @PostMapping(value = "/add_employee_info")
    public void addEmployeeInfo(@RequestBody EmployeeInfoDTO employeeInfoDTO){
        employeeInfoService.addEmployeeInfo(employeeInfoDTO);
    }
    @GetMapping(value = {"/get_detail_employee_info/{id}"})
    public EmployeeInfoDTO getDetailEmployeeInfo(@PathVariable("id") int id){
        return employeeInfoService.getDetailEmployeebyID(id);
    }

    @PostMapping(value = "/update_employee_info")
    public void updateEmployeeInfo(@RequestBody EmployeeInfoDTO employeeInfoDTO){
        employeeInfoService.updateEmployeeInfo(employeeInfoDTO);
    }

//    @GetMapping(value = {"/get_one_employee_info/{id}"})
//    public Optional<EmployeeInfo> getOneEmployeeInfo(@PathVariable int id){
//        return employeeInfoService.findEmployeeInfoByID(id);
//    }
}
