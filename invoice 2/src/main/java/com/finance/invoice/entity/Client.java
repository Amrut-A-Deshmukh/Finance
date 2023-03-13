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

public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clientId;
    private String clientName;
    private String clientAddress;
    private String clientEmail;
    private String clientMobileNumber;
    private String clientLoanAccountNumber;
    private String clientLoanInformation;
    private String clientPassword;
    private String clientUsername;
}
