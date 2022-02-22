package com.project.stockmanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.stockmanagementsystem.entity.Stock;
public interface StockRepo extends JpaRepository<Stock, Integer>
{

	
}
