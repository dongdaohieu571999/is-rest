package com.is.issystem.service;

import com.is.issystem.entities.MainInterest;
import com.is.issystem.repository.entity_repository.MainInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainInterestService {
    @Autowired
    MainInterestRepository mainInterestRepository;

    public List<MainInterest> getAllMainInterst(){
        return mainInterestRepository.findAll();
    }
}
