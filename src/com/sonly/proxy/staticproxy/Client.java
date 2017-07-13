package com.sonly.proxy.staticproxy;

import org.junit.Test;

public class Client {

	@Test
	public void testClient() {
		Singer singer = new StaticProxy(new RealSinger());
		singer.signContract();
		singer.sing();
		singer.checkOut();
		
	}

}
