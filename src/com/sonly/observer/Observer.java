package com.sonly.observer;

/**
 *<ul>
 *<li>Description: 抽象观察者: 为那些在目标状态发生改变时需获得通知的对象定义一个更新接口. 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public interface Observer {
	
	void update(Subject subject);
}
