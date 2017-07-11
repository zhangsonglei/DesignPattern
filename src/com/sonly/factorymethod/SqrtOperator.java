package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description:  在静态工厂模式原有的功能上增加一个功能 ，
 *实现开方运算符
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class SqrtOperator implements Operator<Double>{

	@Override
	public Double getResult(Double... array) {
		if(array!=null && array.length >= 1) {
			return Math.sqrt(array[0]);
		}else 
			throw new RuntimeException("Params Number Error " + array.length);
		
	}
}
