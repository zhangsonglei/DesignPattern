package com.sonly.bridge;

/**
 *<ul>
 *<li>Description: 平板-类型维度  
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class Pad extends Computer {

	public Pad(Brand brand) {
		super(brand);
	}

	@Override
	public String type() {
		return "平板";
	}

}
