package com.is.issystem.repository.entity_dto_repository;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractDTORepository extends JpaRepository<ContractDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT c.*,ca.code FROM is_agency_db.contract as c inner join customer_info as ci \n" +
            "on ci.id = c.id_customer inner join customer_acc as ca on ca.id = ci.id_account where c.code_em_support = ?1 order by id desc")
    public List<ContractDTO> getAllContractDTO(String code_em_support);

    @Query(nativeQuery = true,value = "SELECT c.*,ca.code FROM is_agency_db.contract as c inner join customer_info as ci \n" +
            "on ci.id = c.id_customer inner join customer_acc as ca on ca.id = ci.id_account where c.code_em_support = ?1 and c.id = ?2 order by id desc")
    public ContractDTO getDetailContract(String code,Integer id);
}
