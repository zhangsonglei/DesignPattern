package com.sonly.decorator;

/**
 *<ul>
 *<li>Description: 汉堡基类,被装饰者 Component
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public abstract class Hamburg {
	
	protected String name;
	
	
	public String getName() {
		return name;
	}
	
	public abstract double getPrice();
}
