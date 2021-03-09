package com.is.issystem.repository;

import com.is.issystem.dto.EmployeeDTO;
import com.is.issystem.entities.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeInfoAccRepository extends JpaRepository<EmployeeDTO,Integer>
{
    @Query(value = "select ea.code,ei.name,ei.id,ei.address,ei.date_of_birth,ei.email,ei.phone,ei.ID_card,ei.id_acc,ei.dept_id from is_agency_db.employee_acc as ea right join is_agency_db.employee_info as ei on ea.id = ei.id_acc;",nativeQuery = true)
    List<EmployeeDTO> getEmployeeInfo();
}
