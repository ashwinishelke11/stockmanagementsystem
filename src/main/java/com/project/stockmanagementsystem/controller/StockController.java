package com.project.stockmanagementsystem.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.stockmanagementsystem.dao.StockRepo;
import com.project.stockmanagementsystem.entity.Stock;

@Controller
public class StockController
{
		@Autowired
		StockRepo str;
		
		@RequestMapping("/")
		public String show()
		{
			return "index.jsp";
		}
		
		@RequestMapping("/addstock")
		@ResponseBody
		public String addstock(Stock s)
		{
			try {
			str.save(s);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Stock Added...";
		}
		
		@RequestMapping("/viewstock")
		@ResponseBody
		public String viewstock(int stock_id)
		{
			Stock s = str.findById(stock_id).orElse(new Stock());
			return s.toString();	
		}
		        
		@RequestMapping("/viewallstock")
		@ResponseBody
		public String viewallstock() 
		{

			List<Stock> s = (List<Stock>) str.findAll();
			String rs = "";
			for(Stock s1:s)
			{
				rs = rs + s1 + "\n";
			}
			return rs;
	        
		}        	

		
		@RequestMapping("/updatestock")
		@ResponseBody
		public String updatestock(Stock s)
		{	try {
			str.save(s);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Stock Updated...";
		}
		
		@RequestMapping("/deletestock")
		@ResponseBody
		public String deletestock(int stock_id)
		{	try {
				str.deleteById(stock_id);
		}
				catch(Exception e)
				{
					System.out.println(e);
				}
				return "Stock Deleted";
		}
	}





