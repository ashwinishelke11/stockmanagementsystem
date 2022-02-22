package com.project.stockmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment 
{	@Id
	int stock_id;
	String sup_name;
	float amount;
	String date;
	String mode_of_payment;
	
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	
	public String getSup_name() {
		return sup_name;
	}
	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
	
	public Payment() {
		super();
		}
	
	
	public Payment(int stock_id, String sup_name, float amount, String date, String mode_of_payment) {
		super();
		this.stock_id = stock_id;
		this.sup_name = sup_name;
		this.amount = amount;
		this.date = date;
		this.mode_of_payment = mode_of_payment;
	}
	@Override
	public String toString() {
		return  "\nPAYMENT DETAILS : " + 
				"\nSTOCK ID :  "+this.stock_id +
				"\nSUPPLIER Name :  "+this.sup_name+
				"\nAMOUNT :  "+this.amount +
				"\nDATE  : "+this.date+
				"\nMODE OF PAYMENT : "+this.mode_of_payment;	
	}
	
	
}
