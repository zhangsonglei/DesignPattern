package com.sonly.state;

/**
 *<ul>
 *<li>Description: 定义客户感兴趣的接口
 *<li>维护一个ConcreteState子类实例 -当前状态
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class Context {

	private State current;

	public Context(State current) {
		this.current = current;
	}
	
	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}
	
	public void request() {
		if(current != null)
			current.handle(this);
		else
			System.out.println("问题已经解决，关闭！");
	}
}
