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
public class RelationObserver implements Observer{

	private String orderState;
	
	@Override
	public void update(Subject subject) {
		orderState = subject.getState();
		if (orderState.equals("已付款")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户已关注该店铺");
        } else if (orderState.equals("取消订单")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户取消关注该店铺");
        }
	}
}
