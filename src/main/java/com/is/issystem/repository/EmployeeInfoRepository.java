package com.is.issystem.repository;

import com.is.issystem.entities.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo,Integer> {
}
