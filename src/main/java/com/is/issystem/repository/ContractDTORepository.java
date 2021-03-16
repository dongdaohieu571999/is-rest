package com.is.issystem.repository;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractDTORepository extends JpaRepository<ContractDTO,Integer> {
    @Query(nativeQuery = true,value = "SELECT distinct ct.*,\n" +
            "            iph.created_time as created_time_interset ,iph.id_bill_issuer,iph.id_attachment as id_attachment_interset ,iph.approve_status as approve_status_interset,iph.payment_amount as payment_amount_interset,\n" +
            "                fph.id_invoice,fph.payment_amount,fph.payment_method,fph.id_collecter,fph.created_time as created_time_fee,fph.payment_amount as payment_amount_fee,\n" +
            "                  cch.date as date_changed_contract,cch.approval_status as approval_status_contract_change,cch.id_request\n" +
            "            FROM is_agency_db.contract AS ct \n" +
            "            INNER JOIN is_agency_db.interset_payment_history as iph on iph.id_contract = ct.id\n" +
            "            INNER JOIN is_agency_db.fee_payment_history as fph on fph.id_contract = ct.id\n" +
            "            INNER JOIN is_agency_db.contract_change_history as cch on cch.id_contract = ct.id;")
    List<ContractDTO> getAllContract();

    @Query(nativeQuery = true,value = "SELECT ct.*,\n" +
            "\t   iph.created_time as created_time_interset ,iph.id_bill_issuer,iph.id_attachment as id_attachment_interset ,iph.approve_status as approve_status_interset,iph.payment_amount as payment_amount_interset,\n" +
            "       fph.id_invoice,fph.payment_amount,fph.payment_method,fph.id_collecter,fph.created_time as created_time_fee,fph.payment_amount as payment_amount_fee,\n" +
            "       cch.date as date_changed_contract,cch.approval_status as approval_status_contract_change,cch.id_request\n" +
            "FROM is_agency_db.contract AS ct \n" +
            "INNER JOIN is_agency_db.interset_payment_history as iph on iph.id_contract = ct.id\n" +
            "INNER JOIN is_agency_db.fee_payment_history as fph on fph.id_contract = ct.id\n" +
            "INNER JOIN is_agency_db.contract_change_history as cch on cch.id_contract = ct.id\n" +
            "WHERE ct.id = ?1 ; ")
    ContractDTO getDetailContract(int id);
}
