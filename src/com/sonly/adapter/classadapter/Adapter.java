package com.sonly.adapter.classadapter;

/**
 *<ul>
 *<li>Description:  
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月12日
 *</ul>
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}
}
