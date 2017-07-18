package com.sonly.strategy;


/**
 *<ul>
 *<li>Description: 折扣-具体策略: 以Strategy接口实现某具体算法或行为 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class Discount implements Strategy{

	private double rate = 0.85;
	
	public Discount(double rate) {
		if(rate < 0 || rate > 1.0)
			throw new RuntimeException("折扣率错误，应在0-1之间："+rate);
		else
			this.rate = rate;
	}
	
	@Override
	public double acceptCash(double money) {
		return rate * money;
	}

}
