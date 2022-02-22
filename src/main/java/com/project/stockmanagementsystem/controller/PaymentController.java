package com.project.stockmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.stockmanagementsystem.dao.PaymentRepo;
import com.project.stockmanagementsystem.entity.Payment;
import com.project.stockmanagementsystem.entity.Stock;

@Controller
public class PaymentController
{
		@Autowired
		PaymentRepo par;
		
		
		
		@RequestMapping("/addpayment")
		@ResponseBody
		public String addpayment(Payment pa)
		{	try {
			par.save(pa);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Payment Added...";
		}
		
		@RequestMapping("/viewpayment")
		@ResponseBody
		public String viewpayment(int stock_id)
		{
			
			Payment pa = par.findById(stock_id).orElse(new Payment());
			return pa.toString();
		}
		
		@RequestMapping("/viewallpayment")
		@ResponseBody
		public String viewallpayment() 
		{

			List<Payment> pa = (List<Payment>) par.findAll();
			return pa.toString();
	        
		}
	}
