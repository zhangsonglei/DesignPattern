package com.sonly.observer;

/**
 *<ul>
 *<li>Description: 具体目标/具体主题:
 *<li>将有关状态存入ConcreteSubject;
 *<li>当它的状态发生改变时,向各个观察者发出通知.
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class OrderSubject extends Subject{

	/**
     * 采用拉模型, 将Subject自身发送给Observer
     */
	private String state;
	
	@Override
	protected void notifyObserver() {
		for(Observer observer : observers)
			observer.update(this);
	}

	@Override
	protected String getState() {
		return state;
	}

	@Override
	protected void setState(String state) {
		this.state = state;
	}

}
