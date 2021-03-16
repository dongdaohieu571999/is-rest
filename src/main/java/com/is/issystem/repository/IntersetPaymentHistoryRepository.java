package com.is.issystem.repository;

import com.is.issystem.entities.FeePaymentHistory;
import com.is.issystem.entities.IntersetPaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntersetPaymentHistoryRepository extends JpaRepository<IntersetPaymentHistory,Integer> {
    @Query(nativeQuery = true,value = "SELECT * FROM is_agency_db.interset_payment_history WHERE id_contract = ?1")
    List<IntersetPaymentHistory> getAllIntersetPayment(int id);
}
