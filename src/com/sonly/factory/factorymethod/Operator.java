package com.sonly.factory.factorymethod;

/**
 *<ul>
 *<li>Description: 运算符接口 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public interface Operator<T> {
	@SuppressWarnings("unchecked")
	T getResult(T... array);
}
