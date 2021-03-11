package com.is.issystem.entities;

import javax.persistence.*;

@Entity
@Table(name="workplace_address")
public class WorkplaceAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workadd_id")
    private Integer workadd_id;
    @Column(name = "workadd_no_street")
    private String workadd_no_street;
    @Column(name = "workadd_city")
    private String workadd_city;
    @Column(name = "workadd_district")
    private String workadd_district;
    @Column(name = "workadd_wards")
    private String workadd_wards;

    public Integer getWorkadd_id() {
        return workadd_id;
    }

    public void setWorkadd_id(Integer workadd_id) {
        this.workadd_id = workadd_id;
    }

    public String getWorkadd_no_street() {
        return workadd_no_street;
    }

    public void setWorkadd_no_street(String workadd_no_street) {
        this.workadd_no_street = workadd_no_street;
    }

    public String getWorkadd_city() {
        return workadd_city;
    }

    public void setWorkadd_city(String workadd_city) {
        this.workadd_city = workadd_city;
    }

    public String getWorkadd_district() {
        return workadd_district;
    }

    public void setWorkadd_district(String workadd_district) {
        this.workadd_district = workadd_district;
    }

    public String getWorkadd_wards() {
        return workadd_wards;
    }

    public void setWorkadd_wards(String workadd_wards) {
        this.workadd_wards = workadd_wards;
    }
}
