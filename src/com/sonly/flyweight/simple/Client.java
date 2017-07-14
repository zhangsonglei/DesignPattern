package com.sonly.flyweight.simple;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight flyWeight = factory.factory(new Character('a'));
		flyWeight.operation("First call");
		
		flyWeight = factory.factory(new Character('b'));
		flyWeight.operation("Second call");
		
		flyWeight = factory.factory(new Character('a'));
        flyWeight.operation("Third Call");
	}

}
