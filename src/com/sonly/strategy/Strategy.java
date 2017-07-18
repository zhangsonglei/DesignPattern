package com.sonly.strategy;

/**
 *<ul>
 *<li>Description: 抽象策略: 定义算法族中所有算法的公共接口
 *<li>Context使用这个接口来调用ConcreteStrategy定义的算法 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public interface Strategy {

	double acceptCash(double money);
}
