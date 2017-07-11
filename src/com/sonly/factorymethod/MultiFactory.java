package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description: 实现乘法工厂 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class MultiFactory implements Factory<Integer>{

	@Override
	public Operator<Integer> createOperator() {
		return new MultiOperator();
	}

}
