package com.is.issystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "sub_interest")
public class SubInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "interest_name")
    String interest_name;
    @Column(name = "description")
    String description;
    @Column(name = "fee_period")
    Integer fee_period;
    @Column(name = "maturity_time")
    Integer maturity_time;
    @Column(name = "minimum_value")
    Integer minimum_value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInterest_name() {
        return interest_name;
    }

    public void setInterest_name(String interest_name) {
        this.interest_name = interest_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFee_period() {
        return fee_period;
    }

    public void setFee_period(Integer fee_period) {
        this.fee_period = fee_period;
    }

    public Integer getMaturity_time() {
        return maturity_time;
    }

    public void setMaturity_time(Integer maturity_time) {
        this.maturity_time = maturity_time;
    }

    public Integer getMinimum_value() {
        return minimum_value;
    }

    public void setMinimum_value(Integer minimum_value) {
        this.minimum_value = minimum_value;
    }
}
