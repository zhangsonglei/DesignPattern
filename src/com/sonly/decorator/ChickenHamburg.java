package com.sonly.decorator;

/**
 *<ul>
 *<li>Description: 鸡腿堡类,被装饰者的初始状态 ConcreteComponent
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class ChickenHamburg extends Hamburg{

	public ChickenHamburg() {
		name = "鸡肉堡";
	}
	
	@Override
	public double getPrice() {
		return 10;
	}

}
