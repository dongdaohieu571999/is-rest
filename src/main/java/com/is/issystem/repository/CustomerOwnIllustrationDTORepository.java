package com.is.issystem.repository;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerOwnIllustrationDTORepository extends JpaRepository<CustomerOwnIlustrationDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT coi.id,ac.code,coi.create_time,ci.full_name FROM is_agency_db.customer_own_illustration as coi \n" +
            "INNER JOIN is_agency_db.customer_info as ci ON ci.id = coi.id_customer\n" +
            "INNER JOIN is_agency_db.customer_acc as ac ON ci.id_account = ac.id;")
    List<CustomerOwnIlustrationDTO> listCustomerOwnIllustration();
}
