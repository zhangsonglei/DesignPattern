package com.sonly.state;

/**
 *<ul>
 *<li>Description: 抽象状态: 定义一个接口封装与 Context的一个特定状态 相关的行为 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public interface State {

	void handle(Context context);
}
