package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.CustomerAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAccRepository extends JpaRepository<CustomerAcc,Integer> {
    @Query(value = "SELECT  * from customer_acc where code = ?1 and id != ?2",nativeQuery = true)
    List<CustomerAcc> getAccExist(String code,Integer id);
}
