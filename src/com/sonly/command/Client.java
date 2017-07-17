package com.sonly.command;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
