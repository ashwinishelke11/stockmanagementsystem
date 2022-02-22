package com.project.stockmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.stockmanagementsystem.entity.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Integer>
{

}
