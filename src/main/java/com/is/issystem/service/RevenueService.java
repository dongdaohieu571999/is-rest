package com.is.issystem.service;

import com.is.issystem.entities.Revenue;
import com.is.issystem.repository.entity_repository.RevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevenueService {
    @Autowired
    RevenueRepository revenueRepository;

    public Revenue saveOneRevenue(Revenue revenue){
        return revenueRepository.save(revenue);
    }
}
