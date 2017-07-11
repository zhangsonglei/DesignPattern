package com.sonly.factory;

/**
 *<ul>
 *<li>Description: 静态工厂(注: 只返回产品的抽象[即接口]) 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class OperatorFactory {
	public static Operator<Integer> createOperator(String operation) {
		Operator<Integer> operator;
		
		switch (operation) {
		case "+":
			operator = new AddOperator();
			break;
		case "-":
			operator = new MinusOperator();
			break;
		case "*":
			operator = new MultiOperator();
			break;
		default:
			throw new RuntimeException("错误的运算符： " + operation);
		}
		
		return operator;
	}
}
