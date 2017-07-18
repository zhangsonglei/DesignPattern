package com.sonly.iterator.white;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		String[] strings = {"zsl", "zzz", "sss", "lll"};
	
		Aggregate aggregate = new ConcreteAggregate(strings);
		Iterator iterator = aggregate.createIterator();
		
		while(!iterator.isDone()) {
			System.out.println(iterator.currentItem());
			iterator.next();
		}
		
		iterator.first();
		System.out.println(iterator.currentItem());
	}

}
