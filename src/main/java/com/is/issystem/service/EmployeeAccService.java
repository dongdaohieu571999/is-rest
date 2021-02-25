package com.is.issystem.service;


import java.util.List;
import java.util.Optional;

import com.is.issystem.entities.EmployeeAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.is.issystem.repository.EmployeeAccRepository;

@Service
@Transactional
public class    EmployeeAccService {
    @Autowired
    private EmployeeAccRepository employeeAccRepository;

    public List<EmployeeAcc> findAll(){
        return employeeAccRepository.findAll();
    }

    public void addEmployeeAccount(EmployeeAcc employee_acc){
        employeeAccRepository.save(employee_acc);
    }

    public Optional<EmployeeAcc> findEmployeeAccountByID(Integer id){
        return employeeAccRepository.findById(id);
    }

    public EmployeeAcc updateEmployeeAccount(EmployeeAcc employee_acc){
        EmployeeAcc existEmployeeAcc = employeeAccRepository.findById(employee_acc.getId()).orElse(null);
        existEmployeeAcc.setCode(employee_acc.getCode());
        existEmployeeAcc.setPass(employee_acc.getPass());
        existEmployeeAcc.setStatus(employee_acc.isStatus());
        return employeeAccRepository.save(existEmployeeAcc);
    }

    public boolean checkExistEmployeeAccount(EmployeeAcc employee_acc){
        return employeeAccRepository.existsById(employee_acc.getId());
    }
}
