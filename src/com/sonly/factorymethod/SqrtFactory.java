package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description: 在静态工厂模式原有的功能上增加一个功能 ，
 *实现开方工厂
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class SqrtFactory implements Factory<Double>{

	@Override
	public Operator<Double> createOperator() {
		return new SqrtOperator();
	}

}
