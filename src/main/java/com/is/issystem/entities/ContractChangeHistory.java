package com.is.issystem.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class ContractChangeHistory {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int id_customer;
    @Column
    private Date date;
    @Column
    private int id_request;
    @Column
    private int id_contract;
    @Column
    private String name_contract_owner;
    @Column
    private String payment_period;
    @Column
    private String insurance_type;
    @Column
    private int id_main_interest;
    @Column
    private int id_illustration;
    @Column
    private Date start_time;
    @Column
    private Date end_time;
    @Column
    private Date date_next_payment;
    @Column
    private boolean status;
    @Column
    private String approval_status;
    @Column
    private int contract_total_value;
    @Column
    private int id_employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_request() {
        return id_request;
    }

    public void setId_request(int id_request) {
        this.id_request = id_request;
    }

    public int getId_contract() {
        return id_contract;
    }

    public void setId_contract(int id_contract) {
        this.id_contract = id_contract;
    }

    public String getName_contract_owner() {
        return name_contract_owner;
    }

    public void setName_contract_owner(String name_contract_owner) {
        this.name_contract_owner = name_contract_owner;
    }

    public String getPayment_period() {
        return payment_period;
    }

    public void setPayment_period(String payment_period) {
        this.payment_period = payment_period;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public int getId_main_interest() {
        return id_main_interest;
    }

    public void setId_main_interest(int id_main_interest) {
        this.id_main_interest = id_main_interest;
    }

    public int getId_illustration() {
        return id_illustration;
    }

    public void setId_illustration(int id_illustration) {
        this.id_illustration = id_illustration;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getDate_next_payment() {
        return date_next_payment;
    }

    public void setDate_next_payment(Date date_next_payment) {
        this.date_next_payment = date_next_payment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getApproval_status() {
        return approval_status;
    }

    public void setApproval_status(String approval_status) {
        this.approval_status = approval_status;
    }

    public int getContract_total_value() {
        return contract_total_value;
    }

    public void setContract_total_value(int contract_total_value) {
        this.contract_total_value = contract_total_value;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
}
