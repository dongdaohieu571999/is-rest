package com.is.issystem.service;

import com.is.issystem.entities.DetailCommission;
import com.is.issystem.repository.entity_repository.DetailCommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class DetailCommissionService {
    @Autowired
    DetailCommissionRepository detailCommissionRepository;

    public DetailCommission getOneDetailComission(Integer payment_period_id,BigInteger denomination){
        DetailCommission result = detailCommissionRepository.getOneDetaiCommisson(payment_period_id,denomination);
        System.out.println("getOneDetailComission(Integer payment_period_id,BigInteger denomination)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }
}
