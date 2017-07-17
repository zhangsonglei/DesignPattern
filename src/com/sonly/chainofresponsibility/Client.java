package com.sonly.chainofresponsibility;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Leader generalManger = new GeneralManager(null, "刘备");
		Leader manager = new Manager(generalManger, "诸葛亮");
		Leader director = new Director(manager, "赵云");

		director.handle(new Request("请假", "翡青", 8));
		director.handle(new Request("涨薪", "zjf", 100));
	}

}
