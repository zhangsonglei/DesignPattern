package com.sonly.mediator;

/**
 *<ul>
 *<li>Description: 抽象同事类，定义各同事的公有方法 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public abstract class Country {

	protected UnitedNations unitedNations;
	
	private String name;
	
	public Country(UnitedNations unitedNations, String name) {
		this.unitedNations = unitedNations;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	protected abstract void receive(String msg);
	
	protected abstract void declare(String msg) ;
}
