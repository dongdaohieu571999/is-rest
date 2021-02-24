package com.is.issystem.dto;

import com.is.issystem.entities.AddressInfo;

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
//    private Integer id_account;
    private String full_name;
    private String code;
    private boolean status;
    private Integer id_role;

    private List<AddressInfo> addressInfoList;

//    private Integer id_current_address;
//    private Integer id_permanent_address;
//    private Integer id_contact_address;
//    private Integer id_workplace_address;

    public CustomerDTO(Integer id, Date birth_date, Integer age, String birth_address, String types_identification, String ID_card, String nationality_1, String nationality_2, String nation, String job, String career, String position, String occupation_group, String company_name, String main_business, String specific_work, float monthly_income, String email, String phone_1, String phone_2, String full_name, String code, boolean status, Integer id_role, List<AddressInfo> addressInfoList) {
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
        this.full_name = full_name;
        this.code = code;
        this.status = status;
        this.id_role = id_role;
        this.addressInfoList = addressInfoList;
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

    public List<AddressInfo> getAddressInfoList() {
        return addressInfoList;
    }

    public void setAddressInfoList(List<AddressInfo> addressInfoList) {
        this.addressInfoList = addressInfoList;
    }
}
