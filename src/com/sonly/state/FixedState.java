package com.sonly.state;

public class FixedState implements State{

	static final FixedState instance = new FixedState();
	
	public static State instance() {
		return instance;
	}
	
	@Override
	public void handle(Context context) {
		if(context.getCurrent() == this) {
			System.out.println("开发: Bug已经修复, 测试同学看一下");
			context.setCurrent(ClosedState.instance);
		}
		context.request();

	}

}
