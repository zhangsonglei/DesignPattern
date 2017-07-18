package com.sonly.state;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Context context = new Context(NewState.instance());
		context.request();

	}

}
