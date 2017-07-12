package com.sonly.prototype;

import java.io.IOException;
import java.util.Date;
import org.junit.Test;

public class TestSheep {

	@Test
	public void test() throws ClassNotFoundException, IOException {
		Date birthday = new Date();
		Sheep mother = new Sheep("多利母亲", birthday);
		System.out.println(mother);
		
		//Sheep dolly = mother.clone();//浅复制
		Sheep dolly = mother.deepClone();//深复制
		dolly.setName("多利");
		System.out.println(dolly);
		
		birthday.setTime(1231231);
		System.out.println(mother.getBirthday()+":"+dolly.getBirthday());
	}

}
