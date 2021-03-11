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
            "\t\t\tconadd_city , conadd_district \n" +
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
    List<CustomerDTO> getAllCustomerInfo();

        @Query(nativeQuery = true,value = "SELECT ci.*,code ,ca.status ,\n" +
                "\t\t\tconadd_city , conadd_district \n" +
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

//    @Query(nativeQuery=true,value = "UPDATE `is_agency_db`.`customer_info`\n" +
//            "SET\n" +
//            "`birth_date` = ?1,\n" +
//            "`age` = ?2,\n" +
//            "`birth_address` = ?3,\n" +
//            "`types_identification` = ?4,\n" +
//            "`ID_card` = ?5,\n" +
//            "`nationality_1` = ?6,\n" +
//            "`nationality_2` = ?7,\n" +
//            "`nation` = ?8,\n" +
//            "`job` = ?9,\n" +
//            "`career` = ?10,\n" +
//            "`position` = ?11,\n" +
//            "`occupation_group` = ?12,\n" +
//            "`company_name` = ?13,\n" +
//            "`main_business` = ?14,\n" +
//            "`specific_work` = ?15,\n" +
//            "`monthly_income` = ?16,\n" +
//            "`email` = ?17,\n" +
//            "`phone_1` = ?18,\n" +
//            "`phone_2` = ?19,\n" +
//            "`id_account` = ?20,\n" +
//            "`full_name` = ?21\n" +
//            "WHERE `id` = ?22;\n" +
//            "\n" +
//            "UPDATE `is_agency_db`.`contact_address`\n" +
//            "SET\n" +
//            "`conadd_no_street` = ?23,\n" +
//            "`conadd_city` = ?24,\n" +
//            "`conadd_district` = ?25,\n" +
//            "`conadd_wards` = ?26\n" +
//            "WHERE `conadd_id` =  (select customer_info.id_contact_address as id from customer_info where customer_info.id = ?22);\n" +
//            "\n" +
//            "UPDATE `is_agency_db`.`current_address`\n" +
//            "SET\n" +
//            "`curadd_no_street` = ?27,\n" +
//            "`curadd_city` = ?28,\n" +
//            "`curadd_district` = ?29,\n" +
//            "`curadd_wards` = ?30\n" +
//            "WHERE `curadd_id` = (select customer_info.id_current_address as id from customer_info where customer_info.id = ?22);\n" +
//            "\n" +
//            "UPDATE `is_agency_db`.`permanent_address`\n" +
//            "SET\n" +
//            "`peradd_no_street` = ?31,\n" +
//            "`peradd_city` = ?32,\n" +
//            "`peradd_district` = ?33,\n" +
//            "`peradd_wards` = ?34\n" +
//            "WHERE `peradd_id` = (select customer_info.id_permanent_address as id from customer_info where customer_info.id = ?22);\n" +
//            "\n" +
//            "UPDATE `is_agency_db`.`workplace_address`\n" +
//            "SET\n" +
//            "`workadd_no_street` = ?35,\n" +
//            "`workadd_city` = ?36,\n" +
//            "`workadd_district` = ?37,\n" +
//            "`workadd_wards` = ?38\n" +
//            "WHERE `workadd_id` = (select customer_info.id_workplace_address as id from customer_info where customer_info.id = ?22);")
//    void updateCustomerInfo(Date birth_date, String age,String birth_address,String types_identification,
//                            String ID_card,String nationality_1,String nationality_2,String nation, String job,
//                            String career,String position,String occupation_group,String company_name,);
}
