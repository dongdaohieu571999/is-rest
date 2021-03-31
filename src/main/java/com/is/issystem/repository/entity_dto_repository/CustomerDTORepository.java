package com.is.issystem.repository.entity_dto_repository;

import com.is.issystem.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import java.util.List;

@Repository
public interface CustomerDTORepository extends JpaRepository<CustomerDTO,Integer>{
//    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
//            "ct.id AS id_contract, il.id AS id_illustration,\n" +
//            "            conadd_city , conadd_district \n" +
//            "            ,conadd_no_street ,conadd_wards, \n" +
//            "            curadd_city ,curadd_district ,\n" +
//            "            curadd_no_street , curadd_wards,  \n" +
//            "            peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
//            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
//            "            FROM is_agency_db.customer_info as ci\n" +
//            "            LEFT JOIN is_agency_db.contract as ct on ct.id_customer = ci.id\n" +
//            "            LEFT JOIN is_agency_db.illustration as il on il.id = ct.id_illustration \n" +
//            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
//            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
//            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
//            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
//            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address where ci.code_em_support = ?1 order by created_time desc")
    @Query(nativeQuery = true,name = "find_stock_akhir_dto")
    List<CustomerDTO> getAllCustomerInfo(String code_em_support);

//    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
//            "\tconadd_city , conadd_district \n" +
//            "            ,conadd_no_street ,conadd_wards, \n" +
//            "            curadd_city ,curadd_district ,\n" +
//            "            curadd_no_street , curadd_wards,  \n" +
//            "            peradd_city,peradd_district,peradd_no_street,peradd_wards,\n" +
//            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
//            "            FROM is_agency_db.customer_info as ci \n" +
//            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id \n" +
//            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address\n" +
//            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address \n" +
//            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address \n" +
//            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address order by created_time desc")
    @Query(nativeQuery = true,name = "getAllCustomerInfoByAdmin")
    List<CustomerDTO> getAllCustomerInfoAdmin();

//    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status , \n" +
//            "            conadd_city , conadd_district  \n" +
//            "            ,conadd_no_street ,conadd_wards,  \n" +
//            "            curadd_city ,curadd_district , \n" +
//            "            curadd_no_street , curadd_wards,   \n" +
//            "            peradd_city,peradd_district,peradd_no_street,peradd_wards, \n" +
//            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
//            "            FROM is_agency_db.customer_info as ci  \n" +
//            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id  \n" +
//            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address \n" +
//            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address  \n" +
//            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address  \n" +
//            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address WHERE ci.id = ?1 and ci.code_em_support = ?2")
    @Query(nativeQuery = true,name = "getCustomerInfoDetail")
    CustomerDTO getCustomerInfobyID(int id,String code);

//    @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status , \n" +
//            "            conadd_city , conadd_district  \n" +
//            "            ,conadd_no_street ,conadd_wards,  \n" +
//            "            curadd_city ,curadd_district , \n" +
//            "            curadd_no_street , curadd_wards,   \n" +
//            "            peradd_city,peradd_district,peradd_no_street,peradd_wards, \n" +
//            "            workadd_city,workadd_district,workadd_no_street,workadd_wards\n" +
//            "            FROM is_agency_db.customer_info as ci  \n" +
//            "            INNER JOIN is_agency_db.customer_acc as ca on ci.id_account = ca.id  \n" +
//            "            INNER JOIN contact_address as conadd ON conadd.conadd_id = ci.id_contact_address \n" +
//            "            INNER JOIN current_address as curadd ON curadd.curadd_id = ci.id_current_address  \n" +
//            "            INNER JOIN permanent_address as peradd on peradd.peradd_id = ci.id_permanent_address  \n" +
//            "            INNER JOIN workplace_address as workadd ON workadd.workadd_id = ci.id_workplace_address WHERE ci.id = ?1")
    @Query(nativeQuery = true,name = "getCustomerInfoDetailByAdmin")
    CustomerDTO getCustomerInfobyIDAdmin(int id);


}
