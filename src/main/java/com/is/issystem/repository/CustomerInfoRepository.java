package com.is.issystem.repository;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInfoRepository extends JpaRepository<CustomerDTO,Integer>{
    @Query(nativeQuery = true,value = "SELECT ci.*,code , status ,conadd_city , conadd_district \n" +
            ",conadd_no_street ,conadd_wards ,\n" +
            "curadd_city ,curadd_district ,\n" +
            "curadd_no_street , curadd_wards,  \n" +
            "peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
            "workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
            "FROM is_agency_db.customer_info as ci \n" +
            "INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
            "INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
            "INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
            "INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
            "INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address")
    List<CustomerDTO> getall();
}
