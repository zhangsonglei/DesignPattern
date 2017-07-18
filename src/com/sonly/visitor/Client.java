package com.sonly.visitor;

import java.util.List;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		List<Element> list = ObjectStruture.getList(10);
		
		for(Element element : list) 
			element.accept(new Visitor());
	}

}
