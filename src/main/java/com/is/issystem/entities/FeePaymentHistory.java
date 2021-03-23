package com.is.issystem.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FeePaymentHistory {
    @Column
    @Id
    private int id;
    @Column
    private int id_contract;
    @Column
    private int id_invoice;
    @Column
    private String payment_amount;
    @Column
    private String payment_method;
    @Column
    private int id_collecter;
    @Column
    private Date created_time;

    public int getId() {
        return id;
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

    public int getId_invoice() {
        return id_invoice;
    }

    public void setId_invoice(int id_invoice) {
        this.id_invoice = id_invoice;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
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

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}
