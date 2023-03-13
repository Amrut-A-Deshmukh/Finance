package com.finance.invoice.service;

import com.finance.invoice.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);

    List<Supplier> fetchSupplierList();

    Supplier updateSupplier(Supplier supplier, Long supplierId);

    void deleteSupplierById(Long supplierId);
}
