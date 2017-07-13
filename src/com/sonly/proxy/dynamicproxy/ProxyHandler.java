package com.sonly.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *<ul>
 *<li>Description: 动态代理 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class ProxyHandler implements InvocationHandler {

	private Singer singer;
	
	public ProxyHandler(Singer singer) {
		this.singer = singer;
	}

	/**
     * 代理对象实现的所有接口中的方法，内容都是调用invoke方法
     *
     * @param proxy  代理对象(Proxy.newProxyInstance返回的对象)
     * @param method 当前被调的方法
     * @param args   执行当前方法的参数
     * @return 执行方法method的返回值
     * @throws Throwable
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("代理签约");
	     
		 Object result = null;
	     if (method.getName().equals("sing"))
	    	 result = method.invoke(singer, args);
	     
	     System.out.println("代理收款");
	     
		return result;
	}
}
