package com.sonly.proxy.proxyfactory;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Singer singer = (Singer) new ProxyFactory(new SingerBeforeService(), new RealSinger(), new SingerAferService()).createProxy();
		singer.sing();
		singer.dance();
	} 
	
	private static class SingerBeforeService implements BeforeService{

		@Override
		public void before() {
			System.out.println("代理签约");
		}
	}
	
	private static class SingerAferService implements AfterService {

		@Override
		public void after() {
			System.out.println("代理结款");
		}
		
	}
}
