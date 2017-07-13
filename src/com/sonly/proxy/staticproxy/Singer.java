package com.sonly.proxy.staticproxy;

/**
 *<ul>
 *<li>Description: 定义真实对象和代理对象的公共接口
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public interface Singer {
	
	/** 
	 * 签约
	 */
	void signContract();
	
	/**  
	 * 唱歌
	 */
	void sing();

	/**
	 * 结款
	 */
	void checkOut();
}
