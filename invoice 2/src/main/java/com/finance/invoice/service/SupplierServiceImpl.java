package com.finance.invoice.service;

import com.finance.invoice.entity.Supplier;
import com.finance.invoice.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SupplierServiceImpl implements SupplierService
{
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier saveSupplier(Supplier supplier)
    {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> fetchSupplierList()
    {
        return (List<Supplier>) supplierRepository.findAll();
    }

    @Override
    public Supplier updateSupplier(Supplier supplier, Long supplierId)
    {
        Supplier supplierDb = supplierRepository.findById(supplierId).get();

        if(Objects.nonNull(supplier.getSupplierName()) && !"".equalsIgnoreCase(supplier.getSupplierName()))
        {
            supplierDb.setSupplierName(supplier.getSupplierName());
        }
        if(Objects.nonNull(supplier.getSupplierAddress()) && !"".equalsIgnoreCase(supplier.getSupplierAddress()))
        {
            supplierDb.setSupplierAddress(supplier.getSupplierAddress());
        }
        if(Objects.nonNull(supplier.getSupplierEmail()) && !"".equalsIgnoreCase(supplier.getSupplierEmail()))
        {
            supplierDb.setSupplierEmail(supplier.getSupplierEmail());
        }
        if(Objects.nonNull(supplier.getSupplierMobileNumber()) && !"".equalsIgnoreCase(supplier.getSupplierMobileNumber()))
        {
            supplierDb.setSupplierMobileNumber(supplier.getSupplierMobileNumber());
        }
        if(Objects.nonNull(supplier.getSupplierCreditAccountNumber()) && !"".equalsIgnoreCase(supplier.getSupplierCreditAccountNumber()))
        {
            supplierDb.setSupplierCreditAccountNumber(supplier.getSupplierCreditAccountNumber());
        }
        if(Objects.nonNull(supplier.getSupplierCreditInformation()) && !"".equalsIgnoreCase(supplier.getSupplierCreditInformation()))
        {
            supplierDb.setSupplierCreditInformation(supplier.getSupplierCreditInformation());
        }
        if(Objects.nonNull(supplier.getSupplierUsername()) && !"".equalsIgnoreCase(supplier.getSupplierUsername()))
        {
            supplierDb.setSupplierUsername(supplier.getSupplierUsername());
        }
        if(Objects.nonNull(supplier.getSupplierPassword()) && !"".equalsIgnoreCase(supplier.getSupplierPassword()))
        {
            supplierDb.setSupplierPassword(supplier.getSupplierPassword());
        }

        return supplierRepository.save(supplierDb);
    }

    @Override
    public void deleteSupplierById(Long supplierId)
    {
        supplierRepository.deleteById(supplierId);
    }
}
