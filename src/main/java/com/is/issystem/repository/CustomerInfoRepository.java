package com.is.issystem.repository;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInfoRepository extends JpaRepository<CustomerDTO,Integer>{

}
