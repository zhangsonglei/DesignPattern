package com.sonly.bridge;

/**
 *<ul>
 *<li>Description: 台式机-类型维度 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public String type() {
		return "台式机";
	}

}
