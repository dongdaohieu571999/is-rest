package com.is.issystem.service;

import com.is.issystem.dto.ContractRequestDTO;
import com.is.issystem.dto.DetailRequestDTO;
import com.is.issystem.repository.ContractRequestRepository;
import com.is.issystem.repository.DetailRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractRequestService {
    @Autowired
    private ContractRequestRepository contractRequestRepository;
    @Autowired
    private DetailRequestRepository detailRequestRepository;

    public List<ContractRequestDTO> getAllContractRequest(){
        return contractRequestRepository.getAllRequestContract();
    }

    public DetailRequestDTO getDetailRequest(int id){
        return detailRequestRepository.getRequestbyID(id);
    }
}
