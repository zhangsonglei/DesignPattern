package com.sonly.adapter.objectadapter;

import org.junit.Test;

public class TestAdapter {

	@Test
	public void test() {
		
		/**
		 * 普通功能
		 */
		Target concreteAdapter = new ConcreteTarget();
		concreteAdapter.request();
		
		// 使用特殊功能类，即适配类，  
        // 需要先创建一个被适配类的对象作为参数  
		Target target = new Adapter(new Adaptee());
		target.request();
	}

}
