package com.sonly.interpreter;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		String expStr = "a+b-c"; //为简化处理，这里必须是合法的表达式;
		Map<String, Integer> var = new HashMap<>();   //相当于Interpreter模式中的Context
	    var.put("a", 100);
	    var.put("b", 20);
	    var.put("c", 40);
	    
	    Calculator cal = new Calculator(expStr);
	    assertEquals(80, cal.run(var));
	}

}
