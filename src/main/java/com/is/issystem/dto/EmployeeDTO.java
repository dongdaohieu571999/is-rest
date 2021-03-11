package com.is.issystem.dto;

import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EmployeeDTO {
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
    private String ID_card;
    @Column
    private Integer dept_id;
    @Column
    private Integer id_acc;
    @Column
    private String code;
    @Column
//    private String pass;
//    @Column
//    private Integer id_certificate;
//    @Column
//    private Date start_time;
//    @Column
//    private Date end_time;
//    @Column
//    private Integer id_labour_contract;
//    @Column
//    private Boolean sex;

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

    public String getID_card() {
        return ID_card;
    }

    public void setID_card(String ID_card) {
        this.ID_card = ID_card;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }
//
//    public Integer getId_certificate() {
//        return id_certificate;
//    }
//
//    public void setId_certificate(Integer id_certificate) {
//        this.id_certificate = id_certificate;
//    }
//
//    public Date getStart_time() {
//        return start_time;
//    }
//
//    public void setStart_time(Date start_time) {
//        this.start_time = start_time;
//    }
//
//    public Date getEnd_time() {
//        return end_time;
//    }
//
//    public void setEnd_time(Date end_time) {
//        this.end_time = end_time;
//    }
//
//    public Integer getId_labour_contract() {
//        return id_labour_contract;
//    }
//
//    public void setId_labour_contract(Integer id_labour_contract) {
//        this.id_labour_contract = id_labour_contract;
//    }
//
//    public Boolean getSex() {
//        return sex;
//    }
//
//    public void setSex(Boolean sex) {
//        this.sex = sex;
//    }
}
