package com.sonly.interpreter;

import java.util.Map;

public class AddExpression extends SymbolExpression{

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	int interpreter(Map<String, Integer> var) {
		return left.interpreter(var) + right.interpreter(var);
	}

}
