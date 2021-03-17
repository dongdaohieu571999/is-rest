package com.is.issystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.is.issystem.entities.Illustration;

import java.util.List;

@Repository
public interface IllustrationRepository extends JpaRepository<Illustration,Integer> {
    @Query(nativeQuery = true,value = "SELECT ill.id,ci.id as id_customer,ill.create_time,mi.main_interest_name\n" +
            "FROM is_agency_db.illustration as ill\n" +
            "INNER JOIN is_agency_db.illustration_main_intserest AS imi on ill.id = imi.id_illustration \n" +
            "INNER JOIN is_agency_db.customer_info as ci on ill.id_customer_info = ci.id\n" +
            "INNER JOIN is_agency_db.main_interest AS mi ON mi.id = imi.id_main_interest \n" +
            "where ci.id = ?1")
    List<Illustration> listIllustrationCustomerOwn(int id);
}
