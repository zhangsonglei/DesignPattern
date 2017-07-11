package com.sonly.factorymethod;

/**
 *<ul>
 *<li>Description: 测试工厂方法模式 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class Client {
	public static void main(String[] args) {
		Operator<Integer> add = new AddFactory().createOperator();
		Operator<Integer> minus = new MinusFactory().createOperator();
		Operator<Integer> multi = new MultiFactory().createOperator();
		Operator<Double> sqrt = new SqrtFactory().createOperator();
		
		System.out.println(add.getResult(1,2,3,4,5,6));
		System.out.println(multi.getResult(1,2,3,4,5,6));
		System.out.println(minus.getResult(1,2,3,4,5,6));
		System.out.println(sqrt.getResult(12.0));
	}
}
