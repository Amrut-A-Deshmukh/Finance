package com.finance.invoice.service;

import com.finance.invoice.entity.Invoice;
import com.finance.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class InvoiceServiceImpl implements InvoiceService
{
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvoice(Invoice invoice)
    {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> fetchInvoiceList()
    {
        return (List<Invoice>) invoiceRepository.findAll();
    }

    @Override
    public Invoice updateInvoice(Invoice invoice, Long invoiceId)
    {
        Invoice invoiceDb = invoiceRepository.findById(invoiceId).get();

        if(Objects.nonNull(invoice.getSupplierId()))
        {
            invoiceDb.setSupplierId(invoice.getSupplierId());
        }
        if(Objects.nonNull(invoice.getInvoiceDate()))
        {
            invoiceDb.setInvoiceDate(invoice.getInvoiceDate());
        }
        if(Objects.nonNull(invoice.getInvoiceAmount()))
        {
            invoiceDb.setInvoiceAmount(invoice.getInvoiceAmount());
        }
        if(Objects.nonNull(invoice.getCurrency()) && !"".equalsIgnoreCase(invoice.getCurrency()))
        {
            invoiceDb.setCurrency(invoice.getCurrency());
        }
        if(Objects.nonNull(invoice.getInvoiceFile()))
        {
            invoiceDb.setInvoiceFile(invoice.getInvoiceFile());
        }

        return invoiceRepository.save(invoiceDb);
    }

    @Override
    public void deleteInvoiceById(Long invoiceId)
    {
        invoiceRepository.deleteById(invoiceId);
    }
}
