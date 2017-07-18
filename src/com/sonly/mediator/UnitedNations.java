package com.sonly.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 *<ul>
 *<li>Description: 抽象中介者: 定义一个接口用于与各同事对象通信 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public abstract class UnitedNations {
	
	protected List<Country>  countries = new LinkedList<>();
	
	protected void register(Country country) {
		countries.add(country);
	}
	
	protected void remove(Country country) {
		countries.remove(country);
	}
	
	protected abstract void declare(Country country, String msg);
}
