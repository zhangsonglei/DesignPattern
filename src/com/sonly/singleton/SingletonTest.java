package com.sonly.singleton;

/**
 *<ul>
 *<li>Description:  
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class SingletonTest {

	private static SingletonTest instance = null;
	
	private SingletonTest() {
		
	}
	
	private static synchronized void cyncInit() {
		if(instance == null)
			instance = new SingletonTest();
	}
	
	public static SingletonTest getInstance() {
		if(instance == null)
			cyncInit();
		
		return instance;
	}
}
