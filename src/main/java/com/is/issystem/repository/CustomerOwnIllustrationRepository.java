package com.is.issystem.repository;

import com.is.issystem.dto.CustomerOwnIlustrationDTO;
import com.is.issystem.entities.CustomerOwnIllustration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerOwnIllustrationRepository extends JpaRepository<CustomerOwnIllustration,Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `is_agency_db`.`customer_own_illustration`\n" +
            "(`id_customer`,\n" +
            "`create_time`)\n" +
            "VALUES\n" +
            "((select ci.id from customer_acc as ca INNER JOIN customer_info as ci ON ca.id = ci.id_account where ca.code = ?1 ),\n" +
            "NOW());",nativeQuery = true)
    void addOneCustomerOwnIllustration(String code);
}
