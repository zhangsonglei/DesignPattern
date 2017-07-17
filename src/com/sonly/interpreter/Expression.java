package com.sonly.interpreter;

import java.util.Map;

public abstract class Expression {
	
	public Expression() {
		
	}
	
	abstract int interpreter(Map<String, Integer> var);

}
