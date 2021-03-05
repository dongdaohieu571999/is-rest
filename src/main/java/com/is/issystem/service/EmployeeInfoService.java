package com.is.issystem.service;

import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.entities.EmployeeInfo;
import com.is.issystem.repository.EmployeeAccRepository;
import com.is.issystem.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeInfoService {
    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    public List<EmployeeInfo> findAll(){
        return employeeInfoRepository.findAll();
    }

    public void addEmployeeInfo(EmployeeInfo employee_info){
        employeeInfoRepository.save(employee_info);
    }

    public Optional<EmployeeInfo> findEmployeeInfoByID(Integer id){
        return employeeInfoRepository.findById(id);
    }

    public EmployeeInfo updateEmployeeInfo(EmployeeInfo employee_info){
        EmployeeInfo existEmployeeInfo = employeeInfoRepository.findById(employee_info.getId()).orElse(null);
        existEmployeeInfo.setAddress(employee_info.getAddress());
        existEmployeeInfo.setDate_of_birth(employee_info.getDate_of_birth());
        existEmployeeInfo.setDept_id(employee_info.getDept_id());
        existEmployeeInfo.setEmail(employee_info.getEmail());
        existEmployeeInfo.setEnd_time(employee_info.getEnd_time());
        existEmployeeInfo.setStart_time(employee_info.getStart_time());
        existEmployeeInfo.setId_acc(employee_info.getId_acc());
        existEmployeeInfo.setId(employee_info.getId());
        existEmployeeInfo.setID_card(employee_info.getID_card());
        existEmployeeInfo.setId_certificate(employee_info.getId_certificate());
        existEmployeeInfo.setId_labour_contract(employee_info.getId_labour_contract());
        existEmployeeInfo.setName(employee_info.getName());
        existEmployeeInfo.setPhone(employee_info.getPhone());
        existEmployeeInfo.setSex(employee_info.getSex());
        return employeeInfoRepository.save(existEmployeeInfo);
    }

    public boolean checkExistEmployeeInfo(EmployeeInfo employee_info){
        return employeeInfoRepository.existsById(employee_info.getId());
    }
}
