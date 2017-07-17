package com.sonly.interpreter;

import java.util.Map;

public class VarExpression extends Expression{

	private String key;
	
	public VarExpression(String key) {
		this.key = key;
	}
	
	@Override
	int interpreter(Map<String, Integer> var) {
		return var.get(key);
	}

}
