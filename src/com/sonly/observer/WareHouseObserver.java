package com.sonly.observer;

/**
 *<ul>
 *<li>Description: 具体观察者:
 *<li>存储有关状态，这些状态应与目标的状态保持一致；
 *<li>实现Observer的更新接口以使自身状态与目标的状态保持一致；
 *<li>维护一个指向ConcreteSubject对象的引用.。
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class WareHouseObserver implements Observer {

	private String orderState;
	
	@Override
	public void update(Subject subject) {
		orderState = subject.getState();
		 System.out.println("库存系统接收到消息 [" + orderState + "], 减少库存");
	}

}
