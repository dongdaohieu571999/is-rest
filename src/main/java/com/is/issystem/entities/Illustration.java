package com.is.issystem.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Illustration {
    @Column
    @Id
    private int id;

    @Column
    private int id_customer;

    @Column
    private Date create_time;

    @Column
    private String main_interest_name;

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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getMain_interest_name() {
        return main_interest_name;
    }

    public void setMain_interest_name(String main_interest_name) {
        this.main_interest_name = main_interest_name;
    }
}
