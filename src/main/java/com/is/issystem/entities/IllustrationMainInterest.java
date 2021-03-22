package com.is.issystem.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "illustration_main_intserest")
public class IllustrationMainInterest {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "id_illustration")
    Integer id_illustration;
    @Column(name = "id_main_interest")
    Integer id_main_interest;
    @Column(name = "full_name_insured_person")
    String full_name_insured_person;
    @Column(name = "birth_date_insured_person")
    Date birth_date_insured_person;
    @Column(name = "age_insured_person")
    Integer age_insured_person;
    @Column(name = "gender_insured_person")
    Boolean gender_insured_person;
    @Column(name = "carrier_group_insured_person")
    Integer carrier_group_insured_person;
    @Column(name = "full_name_insurance_buyer")
    String full_name_insurance_buyer;
    @Column(name = "insurance_buyer_relation_insured_person")
    String insurance_buyer_relation_insured_person;
    @Column(name = "fee_value")
    Integer fee_value;
    @Column(name = "denominations")
    Integer denominations;
}
