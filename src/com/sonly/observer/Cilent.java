package com.sonly.observer;

import org.junit.Test;

public class Cilent {

	@Test
	public void test() {
		Subject subject = new OrderSubject();
		Observer payObserver = new PayObserver();
		Observer relationObserver = new RelationObserver();
		Observer wareHouseObserver = new WareHouseObserver();
		
		subject.register(wareHouseObserver);
		subject.register(relationObserver);
		subject.register(payObserver);
		
		subject.setState("已付款");
		subject.notifyObserver();
		System.out.println("________________________");
		subject.setState("取消订单");
		subject.detach(payObserver);
		subject.detach(wareHouseObserver);
		subject.notifyObserver();
	}

}
