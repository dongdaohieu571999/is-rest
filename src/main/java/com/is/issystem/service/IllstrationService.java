package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.illstration;
import com.is.issystem.repository.illstrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class IllstrationService {
    @Autowired
    private illstrationRepository illRepository;

    public List<illstration> getAllillstration(int id){
        return illRepository.listIllustrationCustomerOwn(id);
    }

}
