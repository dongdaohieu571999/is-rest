package com.is.issystem.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_own_illustration")
public class CustomerOwnIllustration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_customer")
    private Integer id_customer;
    @Column(name = "create_time")
    private Date create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_customer() {
        return id_customer;
    }

    public void setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
