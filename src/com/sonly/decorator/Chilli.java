package com.sonly.decorator;

/**
 *<ul>
 *<li>Description:  生菜,装饰者的第二层 ConcreteDecorator 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class Chilli extends Condiment{

	Hamburg hamburg; 
	
	public Chilli(Hamburg hamburg) {
		this.hamburg = hamburg;
	}
	
	@Override
	public String getName() {
		return hamburg.getName()+"加辣椒";
	}

	@Override
	public double getPrice() {
		return hamburg.getPrice();
	}

}
