package com.is.issystem.dto;

import com.is.issystem.entities.AddressInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CustomerDTO {
    @Id
    @Column
    private Integer id;
    @Column
    private Date birth_date;
    @Column
    private Integer age;
    @Column
    private String birth_address;
    @Column
    private String types_identification;
    @Column
    private String id_card;
    @Column
    private String nationality_1;
    @Column
    private String nationality_2;
    @Column
    private String nation;
    @Column
    private String job;
    @Column
    private String career;
    @Column
    private String position;
    @Column
    private String occupation_group;
    @Column
    private String company_name;
    @Column
    private String main_business;
    @Column
    private String specific_work;
    @Column
    private float monthly_income;
    @Column
    private String email;
    @Column
    private String phone_1;
    @Column
    private String phone_2;
    @Column
    private Integer id_account;
    @Column
    private String full_name;
    @Column
    private String code;
    @Column
    private boolean status;

    @Column
    private String conadd_no_street;
    @Column
    private String conadd_city;
    @Column
    private String conadd_district;
    @Column
    private String conadd_wards;

    @Column
    private String curadd_no_street;
    @Column
    private String curadd_city;
    @Column
    private String curadd_district;
    @Column
    private String curadd_wards;

    @Column
    private String peradd_no_street;

    @Column
    private String code_em_support;

    @Column
    private boolean gender;

    @Column
    private String peradd_city;
    @Column
    private String peradd_district;
    @Column
    private String peradd_wards;

    @Column
    private String workadd_no_street;
    @Column
    private String workadd_city;
    @Column
    private String workadd_district;
    @Column
    private String workadd_wards;


    @Column
    private Integer id_current_address;
    @Column
    private Integer id_permanent_address;
    @Column
    private Integer id_contact_address;
    @Column
    private Integer id_workplace_address;
    @Column
    private Date updated_time;
    @Column
    private boolean marital_status;
    @Column
    private Date created_time;
    @Column
    private String source;

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    public boolean isMarital_status() {
        return marital_status;
    }

    public void setMarital_status(boolean marital_status) {
        this.marital_status = marital_status;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirth_address() {
        return birth_address;
    }

    public void setBirth_address(String birth_address) {
        this.birth_address = birth_address;
    }

    public String getTypes_identification() {
        return types_identification;
    }

    public void setTypes_identification(String types_identification) {
        this.types_identification = types_identification;
    }

    public String getID_card() {
        return id_card;
    }

    public void setID_card(String id_card) {
        this.id_card = id_card;
    }

    public String getNationality_1() {
        return nationality_1;
    }

    public void setNationality_1(String nationality_1) {
        this.nationality_1 = nationality_1;
    }

    public String getNationality_2() {
        return nationality_2;
    }

    public void setNationality_2(String nationality_2) {
        this.nationality_2 = nationality_2;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOccupation_group() {
        return occupation_group;
    }

    public void setOccupation_group(String occupation_group) {
        this.occupation_group = occupation_group;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getMain_business() {
        return main_business;
    }

    public void setMain_business(String main_business) {
        this.main_business = main_business;
    }

    public String getSpecific_work() {
        return specific_work;
    }

    public void setSpecific_work(String specific_work) {
        this.specific_work = specific_work;
    }

    public float getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(float monthly_income) {
        this.monthly_income = monthly_income;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_1() {
        return phone_1;
    }

    public void setPhone_1(String phone_1) {
        this.phone_1 = phone_1;
    }

    public String getPhone_2() {
        return phone_2;
    }

    public void setPhone_2(String phone_2) {
        this.phone_2 = phone_2;
    }

    public Integer getId_account() {
        return id_account;
    }

    public void setId_account(Integer id_account) {
        this.id_account = id_account;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getPeradd_no_street() {
        return peradd_no_street;
    }

    public void setPeradd_no_street(String peradd_no_street) {
        this.peradd_no_street = peradd_no_street;
    }

    public String getCode_em_support() {
        return code_em_support;
    }

    public void setCode_em_support(String code_em_support) {
        this.code_em_support = code_em_support;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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

    public Integer getId_workplace_address() {
        return id_workplace_address;
    }

    public void setId_workplace_address(Integer id_workplace_address) {
        this.id_workplace_address = id_workplace_address;
    }
}
