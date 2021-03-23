package com.is.issystem.service;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import com.is.issystem.entities.CustomerOwnIllustration;
import com.is.issystem.repository.CustomerOwnIllustrationDTORepository;
import com.is.issystem.repository.CustomerOwnIllustrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOwnIllustrationService {
    @Autowired
    private CustomerOwnIllustrationDTORepository customerOwnIllustrationDTORepository;

    @Autowired
    private CustomerOwnIllustrationRepository customerOwnIllustrationRepository;

    public List<CustomerOwnIlustrationDTO> getAllCustomerOwnIllustration(){
        return customerOwnIllustrationDTORepository.listCustomerOwnIllustration();
    }

    public void addOneCustomerOwnIllustration(String code){
         customerOwnIllustrationRepository.addOneCustomerOwnIllustration(code);
    }
}
