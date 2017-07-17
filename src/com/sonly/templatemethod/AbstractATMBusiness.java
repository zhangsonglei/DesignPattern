package com.sonly.templatemethod;

public abstract class AbstractATMBusiness {
	
	public void run() {
		System.out.println("插卡");
		System.out.println("输入密码");
		
		if(checkPassword()) {
			onBusiness();
		}
		System.out.println("交易结束，取卡\n");		
	}
	
	// 具体业务处理延迟到子类实现
	public abstract void onBusiness();
	
	private boolean checkPassword() {
		return true;
	}
}
