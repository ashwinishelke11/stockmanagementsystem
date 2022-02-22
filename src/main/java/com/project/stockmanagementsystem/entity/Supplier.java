package com.project.stockmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier 
{	@Id
	int sup_id;
	String sup_name;
	int contact_num;
	String email_id;
	String place;
	
	public int getSup_id() {
		return sup_id;
	}
	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}
	public String getSup_name() {
		return sup_name;
	}
	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}
	public int getContact_num() {
		return contact_num;
	}
	public void setContact_num(int contact_num) {
		this.contact_num = contact_num;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public Supplier() {
		super();
		
	}
	
	
	public Supplier(int sup_id, String sup_name, int contact_num, String email_id, String place) 
	{
		super();
		this.sup_id = sup_id;
		this.sup_name = sup_name;
		this.contact_num = contact_num;
		this.email_id = email_id;
		this.place = place;
	}
	
	@Override
	public String toString() {
		return  "\nSUPPLIER DETAILS : " + 
				"\nSUPPLIER ID :  "+this.sup_id +
				"\nSUPPLIER Name :  "+this.sup_name +
				"\nSUPPLIER CONTACT :  "+this.contact_num +
				"\nSUPPLIER EMAIL : "+this.email_id+
				"\nSUPPLIER PLACE : "+this.place;	
	}
	
	
	
}