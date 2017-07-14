package com.sonly.flyweight.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Character, FlyWeight> flies = new HashMap<>();
	
	/**
     * 复合享元工厂方法
     */
	public FlyWeight factory(List<Character> compositeState) {
		ConcreteCompositeFlyWeight concreteCompositeFlyWeight = new ConcreteCompositeFlyWeight();
		
		for(Character character : compositeState)
			concreteCompositeFlyWeight.add(character, this.factory(character));
		
		return concreteCompositeFlyWeight;
	}
	
	
	
	/**
     * 单纯享元工厂方法
     */
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
