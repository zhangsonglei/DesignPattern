package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description: 实现减法工厂 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class MinusFactory implements Factory<Integer>{

	@Override
	public Operator<Integer> createOperator() {
		return new MinusOperator();
	}
	
}
