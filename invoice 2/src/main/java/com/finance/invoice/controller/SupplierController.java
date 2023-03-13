package com.finance.invoice.controller;

import com.finance.invoice.entity.Supplier;
import com.finance.invoice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController
{
    @Autowired private SupplierService supplierService;

    @PostMapping("/suppliers")
    public Supplier saveSupplier(@RequestBody Supplier supplier)
    {
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/suppliers")
    public List<Supplier> fetchSupplierList()
    {
        return supplierService.fetchSupplierList();
    }

    @PutMapping("/suppliers/{id}")
    public Supplier updateSupplier(@RequestBody Supplier supplier, @PathVariable("id") Long supplierId)
    {
        return supplierService.updateSupplier(supplier, supplierId);
    }

    @DeleteMapping("/suppliers/{id}")
    public String deleteSupplierById(@PathVariable("id") Long supplierId)
    {
        supplierService.deleteSupplierById(supplierId);
        return "Deleted Successfully";
    }
}
