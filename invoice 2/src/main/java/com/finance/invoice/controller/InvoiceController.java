package com.finance.invoice.controller;

import com.finance.invoice.entity.Invoice;
import com.finance.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController
{
    @Autowired private InvoiceService invoiceService;

    @PostMapping("/invoices")
    public Invoice saveInvoice(@RequestBody Invoice invoice)
    {
        return invoiceService.saveInvoice(invoice);
    }

    @GetMapping("/invoices")
    public List<Invoice> fetchInvoiceList()
    {
        return invoiceService.fetchInvoiceList();
    }

    @PutMapping("/invoices/{id}")
    public Invoice updateInvoice(@RequestBody Invoice invoice, @PathVariable("id") Long invoiceId)
    {
        return invoiceService.updateInvoice(invoice, invoiceId);
    }

    @DeleteMapping("/invoices/{id}")
    public String deleteInvoiceById(@PathVariable("id") Long invoiceId)
    {
        invoiceService.deleteInvoiceById(invoiceId);
        return "Deleted Successfully";
    }
}
