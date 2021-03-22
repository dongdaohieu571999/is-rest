package com.is.issystem.repository;

import com.is.issystem.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDTORepository extends JpaRepository<EmployeeDTO,Integer>
{
    @Query(value = "select ei.id,ei.date_of_birth,ei.email,ei.phone,ei.ID_card,ei.id_acc,ea.code,ei.name,ei.dept_id,de.in_dept \n" +
            "from is_agency_db.employee_acc as ea \n" +
            "right join is_agency_db.employee_info as ei on ea.id = ei.id_acc\n" +
            "left join is_agency_db.department as de on de.id = ei.dept_id order by id desc",nativeQuery = true)
    List<EmployeeDTO> getEmployeeInfo();
}
