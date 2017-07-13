package com.sonly.proxy.dynamicproxy;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		/**
         * newProxyInstance方法会动态生成一个代理类, 他实现了Star接口, 然后创建该类的对象.
         *
         * 三个参数
         * 1. ClassLoader: 生成一个类, 这个类也需要加载到方法区中, 因此需要指定ClassLoader来加载该类
         * 2. Class[] interfaces: 要实现的接口
         * 3. InvocationHandler: 调用处理器
         */
        Singer proxySinger = (Singer) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
        													 new Class[]{Singer.class}, 
        													 new ProxyHandler(new RealSinger()));
        proxySinger.sing();
	}

}
