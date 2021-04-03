package com.is.issystem.repository.entity_repository;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInfoRepository extends JpaRepository<CustomerInfo,Integer>{
    @Query(nativeQuery = true,value = "SELECT ci.* FROM is_agency_db.customer_info as ci where ci.code_em_support = ?1 order by created_time desc")
    public List<CustomerInfo> getAllCustomerInfo(String code_em_support);
}
