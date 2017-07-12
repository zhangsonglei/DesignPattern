package com.sonly.factory.abstractfactory;

public class LuxuryEngine implements Engine{

	@Override
	public void start() {
		System.out.println("快速启动");
	}

	@Override
	public void run() {
		System.out.println("快速转动");
	}

}
