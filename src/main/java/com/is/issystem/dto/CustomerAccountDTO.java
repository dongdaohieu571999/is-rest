package com.is.issystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAccountDTO {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "pass")
    private String pass;

    @Column(name = "status")
    private String status;

    @Column(name = "full_name")
    private String fullName;
}
