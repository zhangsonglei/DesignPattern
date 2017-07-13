package com.sonly.proxy.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *<ul>
 *<li>Description: 代理工厂 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月13日
 *</ul>
 */
public class ProxyFactory {
	
	private BeforeService beforeService;
	private Object targetObject;
	private AfterService afterService;
	
	public ProxyFactory() {
		
	}
	
	public ProxyFactory(BeforeService beforeService, Object targetObject, AfterService afterService) {
		this.beforeService = beforeService;
		this.targetObject = targetObject;
		this.afterService = afterService;
	}
	
	private InvocationHandler handler = new InvocationHandler() {
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			
			if(beforeService != null)
				beforeService.before();
			
			Object result = null;
			if(targetObject != null)
				result = method.invoke(targetObject, args);
			
			if(afterService != null)
				afterService.after();
			
			return result;
		}
	};
	
	public Object createProxy() {
		return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), targetObject.getClass().getInterfaces(), handler);
	}
}
