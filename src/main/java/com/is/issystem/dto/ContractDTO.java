package com.is.issystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Getter
@Setter
public class ContractDTO {
    @Column(name = "id")
    @Id
    private Integer id;
    @Column(name = "id_customer")
    private Integer id_customer;
    @Column(name = "name_contract_owner")
    private String name_contract_owner;
    @Column(name = "payment_period")
    private String payment_period;
    @Column(name = "insurance_type")
    private String insurance_type;
    @Column(name = "id_main_interest")
    private Integer id_main_interest;
    @Column(name = "id_illustration")
    private Integer id_illustration;
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "end_time")
    private Date end_time;
    @Column(name = "create_time")
    private Date create_time;
    @Column(name = "status")
    private String status;
    @Column(name = "approval_status")
    private String approval_status;
    @Column(name = "contract_total_value")
    private Integer contract_total_value;
    @Column(name = "code_em_support")
    private String code_em_support;
    @Column(name = "date_changed_contract")
    private Date date_changed_contract;
    @Column(name = "approval_status_contract_change")
    private String approval_status_contract_change;
    @Column(name = "id_change_history")
    private Integer id_change_history;
}


