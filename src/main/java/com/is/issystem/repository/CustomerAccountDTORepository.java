package com.is.issystem.repository;

import com.is.issystem.dto.CustomerAccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerAccountDTORepository extends JpaRepository<CustomerAccountDTO, Integer> {

    public final String getCustomerAccountDTOQuery = "select ca.id, ca.code, ci.full_name, ca.pass, ca.status from is_agency_db.customer_acc as ca, is_agency_db.customer_info as ci\n" +
            "where ci.id_account = ca.id";

    @Query(value = getCustomerAccountDTOQuery, nativeQuery = true)
    List<CustomerAccountDTO> getCustomerAccountDTO();
}
