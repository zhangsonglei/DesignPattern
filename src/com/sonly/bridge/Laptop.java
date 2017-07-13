package com.sonly.bridge;

/**
 *<ul>
 *<li>Description: 笔记本-类型维度  
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}

	@Override
	public String type() {
		return "笔记本";
	}

}
