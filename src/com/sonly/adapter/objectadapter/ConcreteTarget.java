package com.sonly.adapter.objectadapter;

/**
 *<ul>
 *<li>Description: 具体目标类，只提供普通功能 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月12日
 *</ul>
 */
public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("普通类 具有 普通功能...");
	}
}
