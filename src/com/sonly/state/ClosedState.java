package com.sonly.state;

public class ClosedState implements State{

static final ClosedState instance = new ClosedState();
	
	public static State instance() {
		return instance;
	}
	
	@Override
	public void handle(Context context) {
		if(context.getCurrent() == this) {
			System.out.println("测试: Bug验证通过, 已关闭");
			context.setCurrent(null);
		}
	}
}
