package com.is.issystem.repository.entity_repository;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.Contract;
import com.is.issystem.entities.ContractChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = "SELECT * FROM is_agency_db.contract where code_em_support = ?1 order by id desc",nativeQuery = true)
    public List<Contract> getAllContract(String code_em_support);

    @Query(value = "SELECT * from is_agency_db.contract as ct where ct.id = ?1",nativeQuery = true)
    Contract getDetailContract(int id);
}
