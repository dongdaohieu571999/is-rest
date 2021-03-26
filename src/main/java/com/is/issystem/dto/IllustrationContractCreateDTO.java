package com.is.issystem.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class IllustrationContractCreateDTO {
    @Id
    @Column
    private Integer id_illustration;
    @Column
    private Integer id_customer_info;
    @Column
    private String full_name_insured_person;
    @Column
    private String interest_name;
    @Column
    private int insurance_id;

}
