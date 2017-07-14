package com.sonly.decorator;

/**
 *<ul>
 *<li>Description: 生菜,装饰者的第一层 ConcreteDecorator
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class Lettuce extends Condiment{

	Hamburg hamburg;
	
	public Lettuce(Hamburg hamburg) {
		this.hamburg = hamburg;
	}
	
	@Override
	public String getName() {
		return hamburg.getName() + "加生菜";
	}

	@Override
	public double getPrice() {
		return hamburg.getPrice() + 1.0;
	}

}
