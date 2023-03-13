package com.finance.invoice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Invoice
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long invoiceId;
    private long supplierId;
    private Date invoiceDate;
    private double invoiceAmount;
    private String currency;
    private File invoiceFile;
}
