package com.sonly.factory.staticfactory;

/**
 *<ul>
 *<li>Description: 实现乘法运算符 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class MultiOperator implements Operator<Integer>{
	
	@Override
	public Integer getResult(Integer... array) {
		int result = 1;
		for(int i : array)
			result *= i;
		return result;
	}
}
