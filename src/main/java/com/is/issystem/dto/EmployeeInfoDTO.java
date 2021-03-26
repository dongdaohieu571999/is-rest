package com.is.issystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EmployeeInfoDTO {
    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private Date date_of_birth;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String id_card;
    @Column
    private Integer id_certificate;
    @Column
    private Date start_time;
    @Column
    private Date end_time;
    @Column
    private boolean gender;
    @Column
    private Integer dept_id;
    @Column
    private Integer id_acc;
    @Column
    private Integer id_labour_contract;
    @Column
    private Integer id_current_address;
    @Column
    private Integer id_permanent_address;
    @Column
    private Integer id_contact_address;
    @Column
    private boolean marital_status;
    @Column
    private String national;
    @Column
    private String conadd_city;
    @Column
    private String conadd_district;
    @Column
    private String conadd_no_street;
    @Column
    private String conadd_wards;
    @Column
    private String curadd_city;
    @Column
    private String curadd_district;
    @Column
    private String curadd_no_street;
    @Column
    private String curadd_wards;

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Column
    private String peradd_city;
    @Column
    private String peradd_district;
    @Column
    private String peradd_no_street;
    @Column
    private String peradd_wards;
    @Column
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public Integer getId_certificate() {
        return id_certificate;
    }

    public void setId_certificate(Integer id_certificate) {
        this.id_certificate = id_certificate;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getId_acc() {
        return id_acc;
    }

    public void setId_acc(Integer id_acc) {
        this.id_acc = id_acc;
    }

    public Integer getId_labour_contract() {
        return id_labour_contract;
    }

    public void setId_labour_contract(Integer id_labour_contract) {
        this.id_labour_contract = id_labour_contract;
    }

    public Integer getId_current_address() {
        return id_current_address;
    }

    public void setId_current_address(Integer id_current_address) {
        this.id_current_address = id_current_address;
    }

    public Integer getId_permanent_address() {
        return id_permanent_address;
    }

    public void setId_permanent_address(Integer id_permanent_address) {
        this.id_permanent_address = id_permanent_address;
    }

    public Integer getId_contact_address() {
        return id_contact_address;
    }

    public void setId_contact_address(Integer id_contact_address) {
        this.id_contact_address = id_contact_address;
    }

    public boolean isMarital_status() {
        return marital_status;
    }

    public void setMarital_status(boolean marital_status) {
        this.marital_status = marital_status;
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

    public String getConadd_no_street() {
        return conadd_no_street;
    }

    public void setConadd_no_street(String conadd_no_street) {
        this.conadd_no_street = conadd_no_street;
    }

    public String getConadd_wards() {
        return conadd_wards;
    }

    public void setConadd_wards(String conadd_wards) {
        this.conadd_wards = conadd_wards;
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

    public String getCuradd_no_street() {
        return curadd_no_street;
    }

    public void setCuradd_no_street(String curadd_no_street) {
        this.curadd_no_street = curadd_no_street;
    }

    public String getCuradd_wards() {
        return curadd_wards;
    }

    public void setCuradd_wards(String curadd_wards) {
        this.curadd_wards = curadd_wards;
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

    public String getPeradd_no_street() {
        return peradd_no_street;
    }

    public void setPeradd_no_street(String peradd_no_street) {
        this.peradd_no_street = peradd_no_street;
    }

    public String getPeradd_wards() {
        return peradd_wards;
    }

    public void setPeradd_wards(String peradd_wards) {
        this.peradd_wards = peradd_wards;
    }
}
