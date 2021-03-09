package com.is.issystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
public class ContractDTO {
    @Column
    @Id
    private int id;
    @Column
    private int id_customer;
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
    private String status;
    @Column
    private String approval_status;
    @Column
    private int contract_total_value;
    @Column
    private Date created_time_interset;
    @Column
    private int id_bill_issuer;
    @Column
    private int id_attachment_interset;
    @Column
    private String approve_status_interset;
    @Column
    private int id_invoice;
    @Column
    private String payment_method;
    @Column
    private int id_collecter;
    @Column
    private Date created_time_fee;
    @Column
    private Date date_changed_contract;
    @Column
    private String description;
    @Column
    private String approval_status_contract_change;
    @Column
    private int id_attachment_contract_change;
    @Column
    private int id_request;
    @Column
    private String new_information;
    @Column
    private String old_information;
    @Column
    private String payment_amount_interset;
    @Column
    private String payment_amount_fee;

    public String getPayment_amount_interset() {
        return payment_amount_interset;
    }

    public void setPayment_amount_interset(String payment_amount_interset) {
        this.payment_amount_interset = payment_amount_interset;
    }

    public String getPayment_amount_fee() {
        return payment_amount_fee;
    }

    public void setPayment_amount_fee(String payment_amount_fee) {
        this.payment_amount_fee = payment_amount_fee;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public Date getCreated_time_interset() {
        return created_time_interset;
    }

    public void setCreated_time_interset(Date created_time_interset) {
        this.created_time_interset = created_time_interset;
    }

    public int getId_bill_issuer() {
        return id_bill_issuer;
    }

    public void setId_bill_issuer(int id_bill_issuer) {
        this.id_bill_issuer = id_bill_issuer;
    }

    public int getId_attachment_interset() {
        return id_attachment_interset;
    }

    public void setId_attachment_interset(int id_attachment_interset) {
        this.id_attachment_interset = id_attachment_interset;
    }

    public String getApprove_status_interset() {
        return approve_status_interset;
    }

    public void setApprove_status_interset(String approve_status_interset) {
        this.approve_status_interset = approve_status_interset;
    }

    public int getId_invoice() {
        return id_invoice;
    }

    public void setId_invoice(int id_invoice) {
        this.id_invoice = id_invoice;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getId_collecter() {
        return id_collecter;
    }

    public void setId_collecter(int id_collecter) {
        this.id_collecter = id_collecter;
    }

    public Date getCreated_time_fee() {
        return created_time_fee;
    }

    public void setCreated_time_fee(Date created_time_fee) {
        this.created_time_fee = created_time_fee;
    }

    public Date getDate_changed_contract() {
        return date_changed_contract;
    }

    public void setDate_changed_contract(Date date_changed_contract) {
        this.date_changed_contract = date_changed_contract;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApproval_status_contract_change() {
        return approval_status_contract_change;
    }

    public void setApproval_status_contract_change(String approval_status_contract_change) {
        this.approval_status_contract_change = approval_status_contract_change;
    }

    public int getId_attachment_contract_change() {
        return id_attachment_contract_change;
    }

    public void setId_attachment_contract_change(int id_attachment_contract_change) {
        this.id_attachment_contract_change = id_attachment_contract_change;
    }

    public int getId_request() {
        return id_request;
    }

    public void setId_request(int id_request) {
        this.id_request = id_request;
    }

    public String getNew_information() {
        return new_information;
    }

    public void setNew_information(String new_information) {
        this.new_information = new_information;
    }

    public String getOld_information() {
        return old_information;
    }

    public void setOld_information(String old_information) {
        this.old_information = old_information;
    }
}
