package com.is.issystem.repository;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.is.issystem.entities.illstration;

import java.util.List;

@Repository
public interface illstrationRepository extends JpaRepository<illstration,Integer> {
    @Query(nativeQuery = true,value = "SELECT ill.id,ci.id as id_customer,ill.create_time,mi.main_interest_name\n" +
            "FROM is_agency_db.illustration as ill\n" +
            "INNER JOIN is_agency_db.illustration_main_intserest AS imi on ill.id = imi.id_illustration \n" +
            "INNER JOIN is_agency_db.customer_info as ci on ill.id_customer_info = ci.id\n" +
            "INNER JOIN is_agency_db.main_interest AS mi ON mi.id = imi.id_main_interest \n" +
            "where ci.id = ?1")
    List<illstration> listIllustrationCustomerOwn(int id);
}
