package com.is.issystem.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
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

    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "date_of_birth")
    private Date date_of_birth;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "ID_card")
    private String ID_card;
    @Column(name = "id_certificate")
    private Integer id_certificate;
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "end_time")
    private Date end_time;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "dept_id")
    private Integer dept_id;
    @Column(name = "id_acc")
    private Integer id_acc;
    @Column(name = "id_labour_contract")
    private Integer id_labour_contract;
}
