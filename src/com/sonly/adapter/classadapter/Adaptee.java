package com.sonly.adapter.classadapter;

/**
 *<ul>
 *<li>Description: 已存在的、具有特殊功能、但不符合我们既有的标准接口的类 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月12日
 *</ul>
 */
public class Adaptee {
	
	public void specificRequest(){
		System.out.println("被适配类具有 特殊功能...");
	}
}
