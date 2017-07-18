package com.sonly.observer;

import java.util.LinkedList;
import java.util.List;

/**
 *<ul>
 *<li>Description:  目标/主题/抽象通知者:
 *<li>Subject知道它所有的观察者, 可以有任意多个观察者监听同一个目标(将观察者保存在一个聚集中);
 *<li>提供注册/删除观察者的接口.
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public abstract class Subject {

	protected List<Observer> observers = new LinkedList<>();
	
	public void register(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	protected abstract void notifyObserver();
	
	protected abstract String getState();
	
	protected abstract void setState(String state);
}
