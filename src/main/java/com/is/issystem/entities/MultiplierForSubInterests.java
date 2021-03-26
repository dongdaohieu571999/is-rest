package com.is.issystem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "multiplier_for_sub_interests")
public class MultiplierForSubInterests {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "sub_interest_id")
    private Integer sub_interest_id;
    @Column(name = "multiplier")
    private Float multiplier;
}
