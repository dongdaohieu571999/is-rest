package com.is.issystem.dto;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
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
}
