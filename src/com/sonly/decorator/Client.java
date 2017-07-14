package com.sonly.decorator;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Hamburg hamburg = new ChickenHamburg();
		System.out.println(hamburg.getName()+"  价钱："+hamburg.getPrice()); 

		Lettuce lettuce = new Lettuce(new ChickenHamburg());
		System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice()); 
		
		Chilli chilli = new Chilli(new ChickenHamburg());
		System.out.println(chilli.getName()+"  价钱："+chilli.getPrice()); 
	}

}
