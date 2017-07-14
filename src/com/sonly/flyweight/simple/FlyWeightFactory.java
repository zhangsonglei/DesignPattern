package com.sonly.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Character, FlyWeight> flies = new HashMap<>();
	
	public FlyWeight factory(Character state) {
		//先从缓存中查找对象
		FlyWeight flyWeight = flies.get(state);
		
		if(flyWeight == null) {
			//如果缓存中不存在，创建一个新的对象
			
			flyWeight = new ConcreteFlyWeight(state);
			flies.put(state, flyWeight);
		}
		
		return flyWeight;
			
	}
}
