package com.sonly.state;

public class NewState implements State{

static final NewState instance = new NewState();
	
	public static State instance() {
		return instance;
	}
	
	@Override
	public void handle(Context context) {
		if(context.getCurrent() == this) {
			System.out.println("测试: 发现了Bug, 开发同学赶紧处理");
			context.setCurrent(OpenState.instance);
		}
		context.request();

	}
}
