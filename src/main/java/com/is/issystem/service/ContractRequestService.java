package com.is.issystem.service;

import com.is.issystem.dto.ContractRequestDTO;
import com.is.issystem.repository.ContractRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractRequestService {
    @Autowired
    private ContractRequestRepository contractRequestRepository;

    public List<ContractRequestDTO> getAllContractRequest(){
        return contractRequestRepository.getAllRequestContract();
    }
}
