package com.sonly.strategy;

/**
 *<ul>
 *<li>Description: 返利-具体策略: 以Strategy接口实现某具体算法或行为 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class Rebate implements Strategy{

	private double cashState;
	
	private double cashReturn;
	
	public Rebate(double cashState, double cashReturn) {
		this.cashState = cashState;
		this.cashReturn = cashReturn;
	}
	
	@Override
	public double acceptCash(double money) {
		if(money > cashState)
			 money -= Math.floor(money / cashState) * cashReturn;
		
		return money;
	}

}
