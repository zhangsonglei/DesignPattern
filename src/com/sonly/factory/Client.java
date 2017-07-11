package com.sonly.factory;

/**
 *<ul>
 *<li>Description: 测试静态工厂
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class Client {
	public static void main(String[] args) {
		Operator<Integer> add = OperatorFactory.createOperator("+");
		Operator<Integer> minus = OperatorFactory.createOperator("-");
		Operator<Integer> multi = OperatorFactory.createOperator("*");
		
		System.out.println(add.getResult(1,2,3,4,5,6));
		System.out.println(multi.getResult(1,2,3,4,5,6));
		System.out.println(minus.getResult(1,2,3,4,5,6));
	}
}
