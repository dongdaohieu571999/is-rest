package com.is.issystem.repository.entity_repository;
import com.is.issystem.dto.EmployeeInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoAccRepository extends JpaRepository<EmployeeInfoDTO,Integer>
{
    @Query(nativeQuery = true,value = "SELECT ei.*, \n" +
            "        conadd_city , conadd_district,\n" +
            "\t\tconadd_no_street ,conadd_wards, \n" +
            "\t\tcuradd_city ,curadd_district ,\n" +
            "        curadd_no_street , curadd_wards,  \n" +
            "        peradd_city,peradd_district,peradd_no_street,peradd_wards\n" +
            "FROM is_agency_db.employee_info as ei\n" +
            "LEFT JOIN is_agency_db.current_address as ca on ei.id_current_address = ca.curadd_id\n" +
            "LEFT JOIN is_agency_db.contact_address as cad on ei.id_contact_address = cad.conadd_id\n" +
            "LEFT JOIN is_agency_db.permanent_address as pa on pa.peradd_id = ei.id_permanent_address\n" +
            "WHERE ei.id = ?1")
    EmployeeInfoDTO getDetailEmployeeInfobyID(int id);

    @Query(nativeQuery = true,value = "SELECT ei.*, \n" +
            "            conadd_city , conadd_district,\n" +
            "            conadd_no_street ,conadd_wards, \n" +
            "            curadd_city ,curadd_district ,\n" +
            "            curadd_no_street , curadd_wards,  \n" +
            "            peradd_city,peradd_district,peradd_no_street,peradd_wards\n" +
            "            FROM is_agency_db.employee_info as ei\n" +
            "            LEFT JOIN is_agency_db.current_address as ca on ei.id_current_address = ca.curadd_id\n" +
            "            LEFT JOIN is_agency_db.contact_address as cad on ei.id_contact_address = cad.conadd_id\n" +
            "            LEFT JOIN is_agency_db.permanent_address as pa on pa.peradd_id = ei.id_permanent_address\n" +
            "            LEFT JOIN is_agency_db.employee_acc as ea on ea.id = ei.id_acc\n" +
            "            WHERE ea.code = ?1")
    EmployeeInfoDTO getDetailEmployeeInfobyCode(String code);
}
