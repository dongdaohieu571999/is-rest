package com.is.issystem.repository;

import com.is.issystem.dto.ContractListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContractListRepository extends JpaRepository<ContractListDTO, Integer> {
    public final String getContractListQuery = "SELECT ct.id_customer,\n" +
            "ct.id,\n" +
            "ct.name_contract_owner,\n" +
            "ct.payment_period,\n" +
            "ct.insurance_type,\n" +
            "ct.id_main_interest,\n" +
            "ct.id_illustration,\n" +
            "ct.start_time,\n" +
            "ct.status\n" +
            "FROM is_agency_db.contract as ct, is_agency_db.employee_acc as em_acc, is_agency_db.employee_info as em_info\n" +
            "where ct.id_employee = em_info.id and\n" +
            "em_info.id_acc = em_acc.id and\n" +
            "em_acc.code = :employeeCode\n";

    @Query(value = getContractListQuery, nativeQuery = true)
    List<ContractListDTO> getContractList(@Param("employeeCode") String employeeCode);
}
