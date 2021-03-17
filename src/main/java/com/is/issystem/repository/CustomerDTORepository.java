package com.is.issystem.repository;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CustomerDTORepository extends JpaRepository<CustomerDTO,Integer>{
    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
            "\tconadd_city , conadd_district \n" +
            "            ,conadd_no_street ,conadd_wards, \n" +
            "            curadd_city ,curadd_district ,\n" +
            "            curadd_no_street , curadd_wards,  \n" +
            "            peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
            "            FROM is_agency_db.customer_info as ci \n" +
            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address where code_em_support = ?1 order by created_time desc")
    List<CustomerDTO> getAllCustomerInfo(String code_em_support);

    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
            "\tconadd_city , conadd_district \n" +
            "            ,conadd_no_street ,conadd_wards, \n" +
            "            curadd_city ,curadd_district ,\n" +
            "            curadd_no_street , curadd_wards,  \n" +
            "            peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
            "            FROM is_agency_db.customer_info as ci \n" +
            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address order by created_time desc")
    List<CustomerDTO> getAllCustomerInfoAdmin();

    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
            "\tconadd_city , conadd_district \n" +
            "            ,conadd_no_street ,conadd_wards, \n" +
            "            curadd_city ,curadd_district ,\n" +
            "            curadd_no_street , curadd_wards,  \n" +
            "            peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
            "            workadd_city,workadd_district,workadd_no_street,workadd_wards,cont.id as id_contract,illus.id as id_illustration\n" +
            "            FROM is_agency_db.customer_info as ci \n" +
            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address\n" +
            "            INNER JOIN is_agency_db.contract as cont on ci.id = cont.id_customer\n" +
            "            INNER JOIN is_agency_db.illustration as illus on cont.id_illustration = illus.id WHERE ci.id = ?1 and code_em_support = ?2")
    CustomerDTO getCustomerInfobyID(int id,String code);

    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
            "\t\tconadd_city , conadd_district,\n" +
            "\t\tconadd_no_street ,conadd_wards, \n" +
            "\t\tcuradd_city ,curadd_district ,\n" +
            "        curadd_no_street , curadd_wards,  \n" +
            "        peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
            "        workadd_city,workadd_district,workadd_no_street,workadd_wards,\n" +
            "        cont.id as id_contract,\n" +
            "        illus.id as id_illustration\n" +
            "FROM is_agency_db.customer_info as ci \n" +
            "LEFT JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
            "LEFT JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
            "LEFT JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
            "LEFT JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
            "LEFT JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address\n" +
            "LEFT JOIN is_agency_db.contract as cont on ci.id = cont.id_customer\n" +
            "LEFT JOIN is_agency_db.illustration as illus on cont.id_illustration = illus.id \n" +
            "WHERE ci.id = ?1")
    CustomerDTO getCustomerInfobyIDAdmin(int id);


}
