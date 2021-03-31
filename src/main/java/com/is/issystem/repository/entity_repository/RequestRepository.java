package com.is.issystem.repository.entity_repository;

import com.is.issystem.dto.ContractRequestDTO;
import com.is.issystem.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request,Integer>{
    @Modifying
    @Query(nativeQuery = true,value = "UPDATE is_agency_db.request SET status = 'Đã xét duyệt' WHERE id_contract = ?1")
    Void updateContractRequest(int id);

    @Query(value = "select * from is_agency_db.request where status = 'CXD'",nativeQuery = true)
    public List<Request> getAllUncheckReq();

    @Query(value = "select * from is_agency_db.request where not status = 'CXD'",nativeQuery = true)
    public List<Request> getAllCheckReq();
}
