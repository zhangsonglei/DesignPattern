package com.sonly.strategy;

/**
 *<ul>
 *<li>Description: 原价-具体策略: 以Strategy接口实现某具体算法或行为 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class Normal implements Strategy{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
