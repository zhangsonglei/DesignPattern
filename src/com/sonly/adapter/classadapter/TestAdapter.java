package com.sonly.adapter.classadapter;

import org.junit.Test;

public class TestAdapter {

	@Test
	public void test() {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
	
		// 使用特殊功能类
		Target adapter = new Adapter();
		adapter.request();
	}

}
