package com.is.issystem.service;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import com.is.issystem.repository.entity_dto_repository.CustomerOwnIllustrationDTORepository;
import com.is.issystem.repository.entity_repository.CustomerOwnIllustrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOwnIllustrationService {
    @Autowired
    private CustomerOwnIllustrationDTORepository customerOwnIllustrationDTORepository;

    @Autowired
    private CustomerOwnIllustrationRepository customerOwnIllustrationRepository;

    public List<CustomerOwnIlustrationDTO> getAllCustomerOwnIllustration(String code_em_support){
        return customerOwnIllustrationDTORepository.listCustomerOwnIllustration(code_em_support);
    }

    public void addOneCustomerOwnIllustration(String code){
         customerOwnIllustrationRepository.addOneCustomerOwnIllustration(code);
    }
}
