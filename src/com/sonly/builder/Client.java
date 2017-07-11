package com.sonly.builder;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		 CarBuilder lowBuilder = new LowCarBuilder();
	     // 构造低端汽车
	     CarDirector.constructor(lowBuilder);
	     Car lowCar = lowBuilder.getResult();
	     System.out.println(lowCar);

	     CarBuilder luxuryBuilder = new LuxuryCarBuilder();
	     // 相同的构造过程, 不同的Builder, 可以构造出不同的汽车
	     CarDirector.constructor(luxuryBuilder);
	     Car highShip = luxuryBuilder.getResult();
	     System.out.println(highShip);
	}

}
