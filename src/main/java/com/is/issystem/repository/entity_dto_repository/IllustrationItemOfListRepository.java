package com.is.issystem.repository.entity_dto_repository;

import com.is.issystem.dto.IllustrationItemOfList;
import com.is.issystem.entities.Illustration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IllustrationItemOfListRepository extends JpaRepository<IllustrationItemOfList,Integer> {
    @Query(value = "SELECT ill.*,mi.interest_name FROM is_agency_db.illustration as ill INNER JOIN is_agency_db.illustration_main_intserest\n" +
            "as imi on ill.id = imi.id_illustration INNER JOIN is_agency_db.main_interest as mi on mi.id = imi.id_main_interest where ill.id_customer_info = ?1 ",nativeQuery = true)
    List<IllustrationItemOfList> listIllustrationCustomerOwn(int id);
}
