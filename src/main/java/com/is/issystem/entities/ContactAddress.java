package com.is.issystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "contact_address")
public class ContactAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conadd_id")
    private Integer  conadd_id ;
    @Column(name = "conadd_no_street")
    private String  conadd_no_street ;
    @Column(name = "conadd_city")
    private String  conadd_city ;
    @Column(name = "conadd_district")
    private String  conadd_district ;
    @Column(name = "conadd_wards")
    private String  conadd_wards;

    public Integer getConadd_id() {
        return conadd_id;
    }

    public void setConadd_id(Integer conadd_id) {
        this.conadd_id = conadd_id;
    }

    public String getConadd_no_street() {
        return conadd_no_street;
    }

    public void setConadd_no_street(String conadd_no_street) {
        this.conadd_no_street = conadd_no_street;
    }

    public String getConadd_city() {
        return conadd_city;
    }

    public void setConadd_city(String conadd_city) {
        this.conadd_city = conadd_city;
    }

    public String getConadd_district() {
        return conadd_district;
    }

    public void setConadd_district(String conadd_district) {
        this.conadd_district = conadd_district;
    }

    public String getConadd_wards() {
        return conadd_wards;
    }

    public void setConadd_wards(String conadd_wards) {
        this.conadd_wards = conadd_wards;
    }
}
