package com.is.issystem.repository;

import com.is.issystem.entities.EmployeeAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeAccRepository extends JpaRepository<EmployeeAcc,Integer> {
    @Query(value = "SELECT  id_role FROM EmployeeAcc where code = ?1")
    String getOneAcc(String code);
}
