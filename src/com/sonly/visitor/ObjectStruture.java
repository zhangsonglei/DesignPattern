package com.sonly.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectStruture {

	public static List<Element> getList(int count){
		List<Element> list = new ArrayList<>();
		Random random = new Random();
		
		int i = 0;
		while(i++ < count) {
			if(random.nextInt(100) < 50)
				list.add(new ConcreteElement1());
			else
				list.add(new ConcreteElement2());
		}
		
		return list;
	}
}

