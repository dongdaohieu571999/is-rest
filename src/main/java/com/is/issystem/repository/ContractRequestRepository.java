package com.is.issystem.repository;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.ContractRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRequestRepository extends JpaRepository<ContractRequestDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT re.id as id_request,re.date as start_time,re.id_contract,\n" +
            "       ct.name_contract_owner,ct.approval_status,\n" +
            "       ei.id as id_employee,ei.name as employee_name,\n" +
            "       ci.id as id_customer\n" +
            "FROM is_agency_db.request as re\n" +
            "INNER JOIN is_agency_db.contract as ct on re.id_contract = ct.id\n" +
            "INNER JOIN is_agency_db.employee_info as ei on ct.id_employee = ei.id\n" +
            "INNER JOIN is_agency_db.customer_info as ci on ci.id = ct.id_customer")
    List<ContractRequestDTO> getAllRequestContract();

    @Query(nativeQuery = true,value = "SELECT re.id as id_request,re.date as start_time,re.id_contract,\n" +
            "       ct.name_contract_owner,ct.approval_status,\n" +
            "       ei.id as id_employee,ei.name as employee_name,\n" +
            "       ci.id as id_customer\n" +
            "FROM is_agency_db.request as re\n" +
            "INNER JOIN is_agency_db.contract as ct on re.id_contract = ct.id\n" +
            "INNER JOIN is_agency_db.employee_info as ei on ct.id_employee = ei.id\n" +
            "INNER JOIN is_agency_db.customer_info as ci on ci.id = ct.id_customer")
    List<ContractRequestDTO> getDetailRequestContract();


}
