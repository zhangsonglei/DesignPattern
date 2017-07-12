package com.sonly.factory.abstractfactory;

public class LowEngine implements Engine{

	@Override
	public void start() {
		System.out.println("缓慢启动");
	}

	@Override
	public void run() {
		System.out.println("缓慢转动");
	}

}
