package com.is.issystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permanent_address")
public class PermanentAddress {
    @Id
        @Column(name = "peradd_id")
      private Integer  peradd_id ;
    @Column(name = "peradd_no_street")
      private String  peradd_no_street ;
    @Column(name = "peradd_city")
      private String  peradd_city ;
    @Column(name = "peradd_district")
      private String  peradd_district ;
    @Column(name = "peradd_wards")
      private String  peradd_wards;

    public Integer getPeradd_id() {
        return peradd_id;
    }

    public void setPeradd_id(Integer peradd_id) {
        this.peradd_id = peradd_id;
    }

    public String getPeradd_no_street() {
        return peradd_no_street;
    }

    public void setPeradd_no_street(String peradd_no_street) {
        this.peradd_no_street = peradd_no_street;
    }

    public String getPeradd_city() {
        return peradd_city;
    }

    public void setPeradd_city(String peradd_city) {
        this.peradd_city = peradd_city;
    }

    public String getPeradd_district() {
        return peradd_district;
    }

    public void setPeradd_district(String peradd_district) {
        this.peradd_district = peradd_district;
    }

    public String getPeradd_wards() {
        return peradd_wards;
    }

    public void setPeradd_wards(String peradd_wards) {
        this.peradd_wards = peradd_wards;
    }
}
