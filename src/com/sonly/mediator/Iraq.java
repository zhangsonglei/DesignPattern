package com.sonly.mediator;

/**
 *<ul>
 *<li>Description: 具体同事类:
 *<li>每一个同事类都知道它的中介者对象.
 *<li>每一个同事对象在需与其他同事通信时, 与它的中介者通信. 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class Iraq extends Country{

	public Iraq(UnitedNations unitedNations, String name) {
		super(unitedNations, name);
	}
	
	@Override
	protected void receive(String msg) {
		System.out.println("伊拉克收到：" + msg);
	}

	@Override
	protected void declare(String msg) {
		unitedNations.declare(this, msg);
	}
}
