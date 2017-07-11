package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description: 工厂 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public interface Factory<T> {
	Operator<T> createOperator();
}
