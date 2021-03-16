package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.ContractListDTO;
import com.is.issystem.repository.ContractDTORepository;
import com.is.issystem.repository.ContractListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContractService {
    @Autowired
    private ContractDTORepository contractDTORepository;

    @Autowired
    private ContractListRepository contractListRepository;

    public List<ContractDTO> getAllContract(){
        return contractDTORepository.getAllContract();
    }

    public ContractDTO getDetailContract(int id){
        return contractDTORepository.getDetailContract(id);
    }

    public List<ContractListDTO> getAllContract(String employeeCode) {return contractListRepository.getContractList(employeeCode);}

}
