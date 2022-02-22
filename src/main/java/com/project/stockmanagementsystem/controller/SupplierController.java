package com.project.stockmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.stockmanagementsystem.dao.SupplierRepo;
import com.project.stockmanagementsystem.entity.Stock;
import com.project.stockmanagementsystem.entity.Supplier;

@Controller
public class SupplierController
{
		@Autowired
		SupplierRepo sur;
		
		
		
		@RequestMapping("/addsupplier")
		@ResponseBody
		public String addsupplier(Supplier su)
		{	try {
			sur.save(su);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Supplier Added...";
		}
		
		@RequestMapping("/viewsupplier")
		@ResponseBody
		public String viewsupplier(int sup_id)
		{
			
			Supplier su = sur.findById(sup_id).orElse(new Supplier());
			return su.toString();
		}
		
		@RequestMapping("/viewallsupplier")
		@ResponseBody
		public String viewallsupplier() 
		{

			List<Supplier> su = (List<Supplier>) sur.findAll();
			return su.toString();
	        
		}
		
		@RequestMapping("/updatesupplier")
		@ResponseBody
		public String updatesupplier(Supplier su)
		{	try {
			sur.save(su);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Supplier Updated...";
		}
		
		@RequestMapping("/deletesupplier")
		@ResponseBody
		public String deletesupplier(int sup_id)
		{	try {
				sur.deleteById(sup_id);
		}
				catch(Exception e)
				{
					System.out.println(e);
				}
				return "Supplier Deleted";
		}
	}
