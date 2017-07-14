package com.sonly.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyWeight implements FlyWeight{

	private Map<Character, FlyWeight> flies = new HashMap<>();
	
	public void add(Character key, FlyWeight value) {
		flies.put(key, value);
	}
	
	/**
     * 外蕴状态作为参数传入到方法中
     */
	@Override
	public void operation(String state) {
		FlyWeight flyWeight = null;
		for(Object o : flies.keySet()) {
			flyWeight = flies.get(o);
			flyWeight.operation(state);
		}
	}
}
