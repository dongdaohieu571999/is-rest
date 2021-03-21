package com.is.issystem.repository;

import com.is.issystem.entities.EmployeeAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAccRepository extends JpaRepository<EmployeeAcc,Integer> {
    @Query(value = "SELECT  * FROM employee_acc where code = ?1",nativeQuery = true)
    EmployeeAcc getOneAcc(String code);


}
