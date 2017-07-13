package com.sonly.proxy.staticproxy;

/**
 *<ul>
 *<li>Description: 代理对象 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class StaticProxy implements Singer {

	private Singer singer;
	
	public StaticProxy(Singer singer) {
		this.singer = singer;
	}
	
	
	@Override
	public void signContract() {
		System.out.println("代理签约");	
	}

	@Override
	public void sing() {
		singer.sing();
	}

	@Override
	public void checkOut() {
		System.out.println("代理结款");
	}

}
