package com.is.issystem.dto;

import com.is.issystem.entities.AddressInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

public class CustomerDTO {
    private Integer id;
    private Date birth_date;
    private Integer age;
    private String birth_address;
    private String types_identification;
    private String ID_card;
    private String nationality_1;
    private String nationality_2;
    private String nation;
    private String job;
    private String career;
    private String position;
    private String occupation_group;
    private String company_name;
    private String main_business;
    private String specific_work;
    private float monthly_income;
    private String email;
    private String phone_1;
    private String phone_2;
    private Integer id_account;
    private String full_name;
    private String code;
    private boolean status;
    private Integer id_role;

    private String conadd_no_street;
    private String conadd_city;
    private String conadd_district;
    private String conadd_wards;

    private String curadd_no_street;
    private String curadd_city;
    private String curadd_district;
    private String curadd_wards;

    private String peradd_no_street;

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

    public CustomerDTO(Integer id, Date birth_date, Integer age, String birth_address, String types_identification, String ID_card, String nationality_1, String nationality_2, String nation, String job, String career, String position, String occupation_group, String company_name, String main_business, String specific_work, float monthly_income, String email, String phone_1, String phone_2, Integer id_account, String full_name, String code, boolean status, Integer id_role, String conadd_no_street, String conadd_city, String conadd_district, String conadd_wards, String curadd_no_street, String curadd_city, String curadd_district, String curadd_wards, String peradd_no_street, String peradd_city, String peradd_district, String peradd_wards, String workadd_no_street, String workadd_city, String workadd_district, String workadd_wards, Integer id_current_address, Integer id_permanent_address, Integer id_contact_address, Integer id_workplace_address) {
        this.id = id;
        this.birth_date = birth_date;
        this.age = age;
        this.birth_address = birth_address;
        this.types_identification = types_identification;
        this.ID_card = ID_card;
        this.nationality_1 = nationality_1;
        this.nationality_2 = nationality_2;
        this.nation = nation;
        this.job = job;
        this.career = career;
        this.position = position;
        this.occupation_group = occupation_group;
        this.company_name = company_name;
        this.main_business = main_business;
        this.specific_work = specific_work;
        this.monthly_income = monthly_income;
        this.email = email;
        this.phone_1 = phone_1;
        this.phone_2 = phone_2;
        this.id_account = id_account;
        this.full_name = full_name;
        this.code = code;
        this.status = status;
        this.id_role = id_role;
        this.conadd_no_street = conadd_no_street;
        this.conadd_city = conadd_city;
        this.conadd_district = conadd_district;
        this.conadd_wards = conadd_wards;
        this.curadd_no_street = curadd_no_street;
        this.curadd_city = curadd_city;
        this.curadd_district = curadd_district;
        this.curadd_wards = curadd_wards;
        this.peradd_no_street = peradd_no_street;
        this.peradd_city = peradd_city;
        this.peradd_district = peradd_district;
        this.peradd_wards = peradd_wards;
        this.workadd_no_street = workadd_no_street;
        this.workadd_city = workadd_city;
        this.workadd_district = workadd_district;
        this.workadd_wards = workadd_wards;
        this.id_current_address = id_current_address;
        this.id_permanent_address = id_permanent_address;
        this.id_contact_address = id_contact_address;
        this.id_workplace_address = id_workplace_address;
    }

    private String peradd_city;
    private String peradd_district;
    private String peradd_wards;

    private String workadd_no_street;
    private String workadd_city;
    private String workadd_district;
    private String workadd_wards;


    private Integer id_current_address;
    private Integer id_permanent_address;
    private Integer id_contact_address;
    private Integer id_workplace_address;



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
        return ID_card;
    }

    public void setID_card(String ID_card) {
        this.ID_card = ID_card;
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

    public Integer getId_account() {
        return id_account;
    }

    public void setId_account(Integer id_account) {
        this.id_account = id_account;
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

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }
}
