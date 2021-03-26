package com.is.issystem.service;

import com.is.issystem.entities.SubInterest;
import com.is.issystem.repository.entity_repository.SubInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubInterestService {
    @Autowired
    SubInterestRepository subInterestRepository;

    public List<SubInterest> getAllSubInterest(){
        return subInterestRepository.findAll();
    }
}
