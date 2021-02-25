package com.is.issystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="customer_info")
public class CustomerInfo {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "birth_date")
    private Date birth_date;
    @Column(name = "age")
    private Integer age;
    @Column(name = "birth_address")
    private String birth_address;
    @Column(name = "types_identification")
    private String types_identification;
    @Column(name = "ID_card")
    private String ID_card;
    @Column(name = "nationality_1")
    private String nationality_1;
    @Column(name = "nationality_2")
    private String nationality_2;
    @Column(name = "nation")
    private String nation;
    @Column(name = "job")
    private String job;
    @Column(name = "career")
    private String career;
    @Column(name = "position")
    private String position;
    @Column(name = "occupation_group")
    private String occupation_group;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "main_business")
    private String main_business;
    @Column(name = "specific_work")
    private String specific_work;
    @Column(name = "monthly_income")
    private float monthly_income;
    @Column(name = "id_current_address")
    private Integer id_current_address;
    @Column(name = "id_permanent_address")
    private Integer id_permanent_address;
    @Column(name = "id_contact_address")
    private Integer id_contact_address;
    @Column(name = "id_workplace_address")
    private Integer id_workplace_address;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_1")
    private String phone_1;
    @Column(name = "phone_2")
    private String phone_2;
    @Column(name = "id_account")
    private Integer id_account;
    @Column(name = "full_name")
    private String full_name;



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

}
