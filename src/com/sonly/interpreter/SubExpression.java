package com.sonly.interpreter;

import java.util.Map;

public class SubExpression extends SymbolExpression{

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	int interpreter(Map<String, Integer> var) {
		return left.interpreter(var) - right.interpreter(var);
	}

}
