package com.is.issystem.service;


import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.repository.entity_repository.CustomerAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerAccService {
    @Autowired
    private CustomerAccRepository customerInfoRepository;

    
    public List<CustomerAcc> findAll(){
        return customerInfoRepository.findAll();
    }

    public void addCustomerAccount(CustomerAcc customerAcc){
        customerInfoRepository.save(customerAcc);
    }

    public void updateCustomerAccount(CustomerAcc customerAcc){
        Optional<CustomerAcc> acc = customerInfoRepository.findById(customerAcc.getId());
        acc.get().setCode(customerAcc.getCode());
        acc.get().setPass(customerAcc.getPass());
        acc.get().setStatus(customerAcc.isStatus());
        customerInfoRepository.save(acc.get());
    }

    public void findCustomerAccountById(Integer id){
        customerInfoRepository.findById(id);
    }

    public boolean checkExistCustomerAccount(CustomerAcc customerAcc){
        return customerInfoRepository.getIdExist(customerAcc.getCode())!=null?true:false;
    }
}
