package com.is.issystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ContractListDTO {

    private Long contractId;

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    @Id
    @Column(name = "id")
    public Long getContractId() {
        return contractId;
    }

    @Column(name = "id_customer")
    private int idCustomer;

    @Column(name = "name_contract_owner")
    private String nameContractOwner;

    @Column(name = "payment_period")
    private String paymentPeriod;

    @Column(name = "insurance_type")
    private String insuranceType;

    @Column(name = "id_main_interest")
    private int idMainInterest;

    @Column(name = "id_illustration")
    private int idIllustration;

    @Column(name = "status")
    private String status;

    @Column(name = "start_time")
    private Date startTime;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameContractOwner() {
        return nameContractOwner;
    }

    public void setNameContractOwner(String nameContractOwner) {
        this.nameContractOwner = nameContractOwner;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public int getIdMainInterest() {
        return idMainInterest;
    }

    public void setIdMainInterest(int idMainInterest) {
        this.idMainInterest = idMainInterest;
    }

    public int getIdIllustration() {
        return idIllustration;
    }

    public void setIdIllustration(int idIllustration) {
        this.idIllustration = idIllustration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
