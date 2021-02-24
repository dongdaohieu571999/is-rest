package com.is.issystem.entities;

public class AddressInfo {
    private String district;
    private Integer id;
    private String no_street;
    private String city;
    private String wards;

    public AddressInfo(String district, Integer id, String no_street, String city, String wards) {
        this.district = district;
        this.id = id;
        this.no_street = no_street;
        this.city = city;
        this.wards = wards;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo_street() {
        return no_street;
    }

    public void setNo_street(String no_street) {
        this.no_street = no_street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }
}
