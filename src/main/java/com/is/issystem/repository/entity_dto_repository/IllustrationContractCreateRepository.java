package com.is.issystem.repository.entity_dto_repository;

import com.is.issystem.dto.IllustrationContractCreateDTO;
import com.is.issystem.dto.IllustrationItemOfList;
import com.is.issystem.entities.Illustration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IllustrationContractCreateRepository extends JpaRepository<IllustrationContractCreateDTO,Integer> {
    @Query(value = "SELECT imi.id_illustration,i.id_customer_info,imi.full_name_insured_person,mi.interest_name,mi.id as insurance_id\n" +
            "FROM is_agency_db.illustration_main_intserest as imi\n" +
            "INNER JOIN is_agency_db.illustration as i ON imi.id_illustration = i.id\n" +
            "INNER JOIN is_agency_db.main_interest as mi on mi.id = imi.id_main_interest\n" +
            "WHERE imi.id_illustration = ?1",nativeQuery = true)
    IllustrationContractCreateDTO getIllustrationContract(int id);
}
