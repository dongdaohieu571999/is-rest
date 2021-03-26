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
    private String code;
    @Column
    private String name;
    @Column
    private Date date_of_birth;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String in_dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIn_dept() {
        return in_dept;
    }

    public void setIn_dept(String in_dept) {
        this.in_dept = in_dept;
    }
}
