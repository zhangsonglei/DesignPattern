package com.sonly.proxy.dynamicproxy;

/**
 *<ul>
 *<li>Description: 真实对象 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class RealSinger implements Singer {

	@Override
	public void sing() {
		System.out.println("歌手唱歌");
	}

}
