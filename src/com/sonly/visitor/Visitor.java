package com.sonly.visitor;

public class Visitor implements IVisitor{

	@Override
	public void visit(Element el) {
		el.doSomething();
	}

}
