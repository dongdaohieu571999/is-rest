package com.is.issystem.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Referencetable {
    private List<MultiplierForAge> multiplierForAge;
    private List<MultiplierForCareerGroup> multiplierForCareerGroup;
    private List<MultiplierForGenders> multiplierForGenders;
    private List<MultiplierForMainInterest> multiplierForMainInterest;
    private List<MultiplierForPaymentPeriod> multiplierForPaymentPeriod;
    private List<MultiplierForSubInterests> multiplierForSubInterests;

    public Referencetable(List<MultiplierForAge> multiplierForAge, List<MultiplierForCareerGroup> multiplierForCareerGroup, List<MultiplierForGenders> multiplierForGenders, List<MultiplierForMainInterest> multiplierForMainInterest, List<MultiplierForPaymentPeriod> multiplierForPaymentPeriod, List<MultiplierForSubInterests> multiplierForSubInterests) {
        this.multiplierForAge = multiplierForAge;
        this.multiplierForCareerGroup = multiplierForCareerGroup;
        this.multiplierForGenders = multiplierForGenders;
        this.multiplierForMainInterest = multiplierForMainInterest;
        this.multiplierForPaymentPeriod = multiplierForPaymentPeriod;
        this.multiplierForSubInterests = multiplierForSubInterests;
    }
}
