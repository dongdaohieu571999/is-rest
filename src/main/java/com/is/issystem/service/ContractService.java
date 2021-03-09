package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.repository.ContractDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContractService {
    @Autowired
    private ContractDTORepository contractDTORepository;

    public List<ContractDTO> getAllContract(){
        return contractDTORepository.getAllContract();
    }

    public ContractDTO getDetailContract(int id){
        return contractDTORepository.getDetailContract(id);
    }

}
