package com.sonly.flyweight.composite;

public class ConcreteFlyWeight implements FlyWeight{

	private Character intrinsicState = null;
	
	/**
	 * 构造函数，内蕴状态作为参数传入
	 * @param state
	 */
	public ConcreteFlyWeight(Character state) {
		intrinsicState = state;
	}
	
	/**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
	@Override
	public void operation(String state) {
		System.out.println("Intrinsic state:" + intrinsicState);
		System.out.println("Extrinsic state:" + state);
	}

}
