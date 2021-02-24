package com.is.issystem.repository;

import com.is.issystem.entities.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo,Integer> {
}
