package com.is.issystem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "multiplier_for_main_interest")
public class MultiplierForMainInterest {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "main_interest_id")
    private Integer main_interest_id;
    @Column(name = "multiplier")
    private Float multiplier;
}
