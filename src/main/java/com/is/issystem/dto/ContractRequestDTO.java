package com.is.issystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class ContractRequestDTO {
    @Column
    @Id
    private int id_request;
    @Column
    private int id_customer;
    @Column
    private int id_employee;
    @Column
    private int id_contract;
    @Column
    private Date start_time;
    @Column
    private String employee_name;
    @Column
    private String description;
    @Column
    private String name_contract_owner;

    @Column
    private String approval_status;
    @Column
    private String status;
}
