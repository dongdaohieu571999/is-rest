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

}
