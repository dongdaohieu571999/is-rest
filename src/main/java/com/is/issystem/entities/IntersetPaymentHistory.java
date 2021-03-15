package com.is.issystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IntersetPaymentHistory {
    @Column
    @Id
    private int id;
    @Column
    private int id_contract;
    @Column
    private int id_main_interest;
    @Column
    private int id_bill_issuer;
    @Column
    private int id_attachment;
    @Column
    private String payment_amount;
    @Column
    private String approve_status;
    @Column
    private Date created_time;

    public int getId() {
        return id;
    }

    public String getApprove_status() {
        return approve_status;
    }

    public void setApprove_status(String approve_status) {
        this.approve_status = approve_status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_contract() {
        return id_contract;
    }

    public void setId_contract(int id_contract) {
        this.id_contract = id_contract;
    }

    public int getId_main_interest() {
        return id_main_interest;
    }

    public void setId_main_interest(int id_main_interest) {
        this.id_main_interest = id_main_interest;
    }

    public int getId_bill_issuer() {
        return id_bill_issuer;
    }

    public void setId_bill_issuer(int id_bill_issuer) {
        this.id_bill_issuer = id_bill_issuer;
    }

    public int getId_attachment() {
        return id_attachment;
    }

    public void setId_attachment(int id_attachment) {
        this.id_attachment = id_attachment;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}
