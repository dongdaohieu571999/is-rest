package com.is.issystem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "multiplier_for_main_benifit")
public class MultiplierForMainBenifit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "sub_benifit_id")
    private Integer sub_benifit_id;
    @Column(name = "multiplier")
    private Float multiplier;
}