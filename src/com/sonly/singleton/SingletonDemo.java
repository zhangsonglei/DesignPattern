package com.sonly.singleton;

/**
 *<ul>
 *<li>Description: 高效，线程安全
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class SingletonDemo {
	
	/**
	 * 私有构造方法，防止被实例化
	 */
	private SingletonDemo() {
	}
	
	/**
	 * 使用一个内部类来维护单例 
	 */
	private static class SingletonFactory {
		private static SingletonDemo instance = new SingletonDemo();
	}
	
	/**
	 * <li>获取实例
	 * @return instance
	 */
	public static SingletonDemo getInstance() {
		return SingletonFactory.instance;
	}
	
	/**
	 * <li> 若对象被用于序列化，可保证对象在序列化前后保持一致 
	 * @return instance
	 */
	public Object readResolve() {
		return getInstance();
	}
}
