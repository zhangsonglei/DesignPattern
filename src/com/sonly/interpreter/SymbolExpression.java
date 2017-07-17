package com.sonly.interpreter;

public abstract class SymbolExpression extends Expression{

	protected Expression left;
	
	protected Expression right;
	
	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}
}
