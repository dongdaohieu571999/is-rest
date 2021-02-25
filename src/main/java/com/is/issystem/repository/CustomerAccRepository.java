package com.is.issystem.repository;

import com.is.issystem.entities.CustomerAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerAccRepository extends JpaRepository<CustomerAcc,Integer> {
    @Query(value = "SELECT  id from CustomerAcc where code = ?1")
    String getIdExist(String code);

}
