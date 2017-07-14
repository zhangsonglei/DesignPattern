package com.sonly.facade;


/**
 *<ul>
 *<li>Description: 子系统共有的功能，抽象类 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public abstract class Apartment {
	
	private String location;

	private double price;

	protected int status;
		
	public Apartment(String location, double price, int status) {
		this.location = location;
		this.price = price;
		this.status = status;
	}
	
	public String getLocation(){
		return location;
	}

	public double getPrice() {
		return price;
	}

	public int getStatus() {
		return status;
	}

	public abstract void setStatus(int status);
	
	
}
