package com.finance.invoice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Supplier
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierEmail;
    private String supplierMobileNumber;
    private String supplierCreditAccountNumber;
    private String supplierCreditInformation;
    private String supplierUsername;
    private String supplierPassword;
}
