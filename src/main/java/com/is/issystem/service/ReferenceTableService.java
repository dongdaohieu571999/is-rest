package com.is.issystem.service;

import com.is.issystem.entities.*;
import com.is.issystem.repository.entity_repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceTableService {
    @Autowired
    MultiplierForAgeRepository multiplierForAgeRepository;
    @Autowired
    MultiplierForCareerGroupRepository multiplierForCareerGroupRepository;
    @Autowired
    MultiplierForGendersRepository multiplierForGendersRepository;
    @Autowired
    MultiplierForMainInterestRepository multiplierForMainInterestRepository;
    @Autowired
    MultiplierForPaymentPeriodRepository multiplierForPaymentPeriodRepository;
    @Autowired
    MultiplierForSubInterestsRepository multiplierForSubInterestsRepository;


    public List<MultiplierForAge> findAllMultiplierForAge(){
        return multiplierForAgeRepository.findAll();
    }

    public List<MultiplierForCareerGroup> findAllMultiplierForCareerGroup(){
        return multiplierForCareerGroupRepository.findAll();
    }

    public List<MultiplierForGenders> findAllMultiplierForGenders(){
        return multiplierForGendersRepository.findAll();
    }

    public List<MultiplierForMainInterest> findAllMultiplierForMainInterest(){
        return multiplierForMainInterestRepository.findAll();
    }

    public List<MultiplierForPaymentPeriod> findAllMultiplierForPaymentPeriod(){
        return multiplierForPaymentPeriodRepository.findAll();
    }

    public List<MultiplierForSubInterests> findAllMultiplierForSubInterests(){
        return multiplierForSubInterestsRepository.findAll();
    }
}
