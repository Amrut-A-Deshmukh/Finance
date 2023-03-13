package com.finance.invoice.service;

import com.finance.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    Invoice saveInvoice(Invoice invoice);

    List<Invoice> fetchInvoiceList();

    Invoice updateInvoice(Invoice invoice, Long invoiceId);

    void deleteInvoiceById(Long invoiceId);
}
