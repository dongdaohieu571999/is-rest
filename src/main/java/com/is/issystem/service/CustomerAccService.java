package com.is.issystem.service;


import com.is.issystem.dto.CustomerAccountDTO;
import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.repository.CustomerAccRepository;
import com.is.issystem.repository.CustomerAccountDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerAccService {
    @Autowired
    private CustomerAccRepository customerInfoRepository;

    @Autowired
    private CustomerAccountDTORepository customerAccountDTORepository;
    
    public List<CustomerAcc> findAll(){
        return customerInfoRepository.findAll();
    }

    public void addCustomerAccount(CustomerAcc customerAcc){
        customerInfoRepository.save(customerAcc);
    }

    public void findCustomerAccountById(Integer id){
        customerInfoRepository.findById(id);
    }

    public boolean checkExistCustomerAccount(CustomerAcc customerAcc){
        return customerInfoRepository.getIdExist(customerAcc.getCode())!=null?true:false;
    }

    public List<CustomerAccountDTO> getAllCustomerAccountDTO(){
        return customerAccountDTORepository.getCustomerAccountDTO();
    }
}
