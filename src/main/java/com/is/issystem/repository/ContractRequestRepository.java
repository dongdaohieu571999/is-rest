package com.is.issystem.repository;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.ContractRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRequestRepository extends JpaRepository<ContractRequestDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT ct.*,ei.name as employee_name\n" +
            "FROM is_agency_db.contract as ct\n" +
            "INNER JOIN is_agency_db.employee_info as ei on ct.id_employee = ei.id_acc\n" +
            "WHERE approval_status = 'not active'")
    List<ContractRequestDTO> getAllRequestContract();


}
