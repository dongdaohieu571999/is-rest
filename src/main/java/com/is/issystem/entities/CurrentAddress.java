package com.is.issystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "current_address")
public class CurrentAddress {
    @Id
    @Column(name = "curadd_id")
    private Integer  curadd_id ;
    @Column(name = "curadd_no_street")
    private String  curadd_no_street ;
    @Column(name = "curadd_city")
    private String  curadd_city ;
    @Column(name = "curadd_district")
    private String  curadd_district ;
    @Column(name = "curadd_wards")
    private String  curadd_wards;

    public Integer getCuradd_id() {
        return curadd_id;
    }

    public void setCuradd_id(Integer curadd_id) {
        this.curadd_id = curadd_id;
    }

    public String getCuradd_no_street() {
        return curadd_no_street;
    }

    public void setCuradd_no_street(String curadd_no_street) {
        this.curadd_no_street = curadd_no_street;
    }

    public String getCuradd_city() {
        return curadd_city;
    }

    public void setCuradd_city(String curadd_city) {
        this.curadd_city = curadd_city;
    }

    public String getCuradd_district() {
        return curadd_district;
    }

    public void setCuradd_district(String curadd_district) {
        this.curadd_district = curadd_district;
    }

    public String getCuradd_wards() {
        return curadd_wards;
    }

    public void setCuradd_wards(String curadd_wards) {
        this.curadd_wards = curadd_wards;
    }
}
