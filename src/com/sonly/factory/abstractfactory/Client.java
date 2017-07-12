package com.sonly.factory.abstractfactory;

import org.junit.Test;

public class Client {

	@Test
	public void testLow() {
		CarFactory factory = new LowCarFactory();
		Engine engine = factory.createEngine();
		Tyre tyre = factory.createTyre();
		
		engine.start();
		engine.run();
		tyre.revolve();
	}
	
	@Test
	public void testLuxury() {
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();
		Tyre tyre = factory.createTyre();
		
		engine.start();
		engine.run();
		tyre.revolve();
	}

}
