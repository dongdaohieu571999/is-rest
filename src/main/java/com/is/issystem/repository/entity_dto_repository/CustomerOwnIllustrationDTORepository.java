package com.is.issystem.repository.entity_dto_repository;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerOwnIllustrationDTORepository extends JpaRepository<CustomerOwnIlustrationDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT coi.id,ac.code,coi.create_time,coi.end_time,ci.full_name,coi.id_customer " +
            "FROM is_agency_db.customer_own_illustration as coi \n" +
            "INNER JOIN is_agency_db.customer_info as ci ON ci.id = coi.id_customer\n" +
            "INNER JOIN is_agency_db.customer_acc as ac ON ci.id_account = ac.id where ci.code_em_support = ?1 order by id desc;")
    List<CustomerOwnIlustrationDTO> listCustomerOwnIllustration(String code_em_support);

    @Query(nativeQuery = true,value = "SELECT coi.id,ac.code,coi.create_time,coi.end_time,ci.full_name,coi.id_customer \n" +
            "            FROM is_agency_db.customer_own_illustration as coi \n" +
            "            INNER JOIN is_agency_db.customer_info as ci ON ci.id = coi.id_customer\n" +
            "            INNER JOIN is_agency_db.customer_acc as ac ON ci.id_account = ac.id \n" +
            "            where (ci.code_em_support = ?1 and (create_time >= ?2 and end_time <= ?3))\n" +
            "            and (full_name LIKE ?4 or id_customer LIKE ?4 )\n" +
            "            order by id desc;")
    List<CustomerOwnIlustrationDTO> searchListCustomerOwnIllustration(String code_em_support,String create_time,String end_time,String searchValue);
}
