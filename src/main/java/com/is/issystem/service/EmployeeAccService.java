package com.is.issystem.service;


import java.util.List;
import java.util.Optional;

import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.entities.EmployeeInfo;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.is.issystem.repository.EmployeeAccRepository;

import static com.is.issystem.service.TokenAuthenticationService.SECRET;
import static com.is.issystem.service.TokenAuthenticationService.TOKEN_PREFIX;

@Service
@Transactional(rollbackFor = Exception.class)
    public class EmployeeAccService {
        @Autowired
        private EmployeeAccRepository employeeAccRepository;

        public List<EmployeeAcc> findAll() {
            return employeeAccRepository.findAll();
        }

        public void addEmployeeAccount(EmployeeAcc employee_acc) {
            employeeAccRepository.save(employee_acc);
        }


        public Optional<EmployeeAcc> findEmployeeAccountByID(Integer id) {
            return employeeAccRepository.findById(id);
        }

        public EmployeeAcc findEmployeeAccountByCode(String token_id) {
            if (token_id != null) {
                String user = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token_id.replace(TOKEN_PREFIX, ""))
                        .getBody()
                        .getSubject();
                EmployeeAcc employeeAcc = new EmployeeAcc();
                employeeAcc.setId_role(employeeAccRepository.getOneAcc(user).getId_role());
                return employeeAcc;
            }
            return null;
        }

        public EmployeeAcc updateEmployeeAccount(EmployeeAcc employee_acc) {
            EmployeeAcc existEmployeeAcc = employeeAccRepository.getOneAcc(employee_acc.getCode());
            existEmployeeAcc.setCode(employee_acc.getCode());
            existEmployeeAcc.setPass(employee_acc.getPass());
            existEmployeeAcc.setStatus(employee_acc.isStatus());
            return employeeAccRepository.save(existEmployeeAcc);
        }

        public boolean checkExistEmployeeAccount(EmployeeAcc employee_acc) {
            return employeeAccRepository.existsById(employee_acc.getId());
        }


    }

