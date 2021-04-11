package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.EmployeeAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeAccRepository extends JpaRepository<EmployeeAcc,Integer> {
    @Query(value = "SELECT  * FROM employee_acc where code = ?1",nativeQuery = true)
    EmployeeAcc getOneAcc(String code);

    @Query(value = "SELECT * FROM is_agency_db.employee_acc where id_role = ?1 ",nativeQuery = true)
    public List<EmployeeAcc> getAllEmaccByIdRole(Integer id_role);


}
