package com.is.issystem.dto;

import com.is.issystem.entities.AddressInfo;
import lombok.*;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
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
}
