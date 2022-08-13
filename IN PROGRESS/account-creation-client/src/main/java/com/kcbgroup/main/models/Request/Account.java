package com.kcbgroup.main.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class Account {
    private Long accNo;
    private String accountType;
    private Date accountCreationDate;
    private String branchName;
    private String branchCountry;
    private String branchCity;
    private String branchLocation;
    private String accountNumberT24;
    private String successIndicator;
    private String customerNumber;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "cust_id", referencedColumnName = "nationalId")
    @JsonIgnore
    private Customer customer;
}
