package com.sonly.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		 List<Character> compositeState = new ArrayList<Character>();
	     compositeState.add('a');
	     compositeState.add('b');
	     compositeState.add('c');
	     compositeState.add('a');
	     compositeState.add('b');
	        
	     FlyWeightFactory flyFactory = new FlyWeightFactory();
	     FlyWeight compositeFly1 = flyFactory.factory(compositeState);
	     FlyWeight compositeFly2 = flyFactory.factory(compositeState);
	     compositeFly1.operation("Composite Call");
	        
	     System.out.println("---------------------------------");        
	     System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
	        
	     Character state = 'a';
	     FlyWeight fly1 = flyFactory.factory(state);
	     FlyWeight fly2 = flyFactory.factory(state);
	     System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}

}
