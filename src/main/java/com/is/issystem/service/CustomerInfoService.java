package com.is.issystem.service;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import com.is.issystem.repository.CustomerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerInfoService {
    @Autowired
    CustomerInfoRepository customerInfoRepository;

    public List<CustomerDTO> findAll(){
        return  customerInfoRepository.getAllCustomerInfo();
    }

    public CustomerDTO getCustomerDetail(int id){
        return customerInfoRepository.getCustomerInfobyID(id);
    }

}
