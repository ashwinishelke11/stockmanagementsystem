package com.project.stockmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.stockmanagementsystem.entity.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Integer>
{

}
