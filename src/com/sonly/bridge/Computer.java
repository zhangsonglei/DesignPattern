package com.sonly.bridge;

/**
 *<ul>
 *<li>Description: 类型维度抽象类 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public abstract class Computer {

	private Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public abstract String type();
	
	public void sale() {
		System.out.println("我们卖"+brand.brand()+ this.type()+"电脑");
	}
}
