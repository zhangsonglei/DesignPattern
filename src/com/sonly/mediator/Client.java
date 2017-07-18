package com.sonly.mediator;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		UnitedNations mediator = new UnitedNationsSecurityCouncil();

        Country usa = new USA(mediator, "美国");
        Country china = new China(mediator, "中国");
        Country iraq = new Iraq(mediator, "伊拉克");

        mediator.register(usa);
        mediator.register(china);
        mediator.register(iraq);

        usa.declare("我要打伊拉克, 谁管我跟谁急!!!");
        System.out.println("----------");
        china.declare("我们强烈谴责!!!");
        System.out.println("----------");
        iraq.declare("来呀, 来互相伤害呀!!!");
	}

}
