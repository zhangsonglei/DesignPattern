package com.sonly.facade;

/**
 *<ul>
 *<li>Description:  子系统集合: 实现子系统功能, 处理Facade对象指派的任务( 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class XihuApartment extends Apartment{

	public XihuApartment(String location, double price, int status) {
		super(location, price, status);
	}

	@Override
	public void setStatus(int status) {
		super.status = status;
	}
}
