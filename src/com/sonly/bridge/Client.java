package com.sonly.bridge;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Computer computer = new Laptop(new Lenovo());
		computer.sale();
	}

}
