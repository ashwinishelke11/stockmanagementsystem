package com.project.stockmanagementsystem.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock
{
	@Id
	int stock_id;
	String stock_name;
	String stock_type;
	float stock_price;
	
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getStock_type() {
		return stock_type;
	}
	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}
	public float getStock_price() {
		return stock_price;
	}
	public void setStock_price(float stock_price) {
		this.stock_price = stock_price;
	}
	
	public Stock()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stock(int stock_id, String stock_name, String stock_type, float stock_price) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.stock_type = stock_type;
		this.stock_price = stock_price;
	}
	@Override
	public String toString() 
	{
		return  "STOCK DETAILS : " + 
				" Stock ID :  "+this.stock_id +
				" Stock Name :  "+this.stock_name +
				" Stock Type :  "+this.stock_type +
				" Stock Price : "+this.stock_price;	

	}
	
	
	
}
