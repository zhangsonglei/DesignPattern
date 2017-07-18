package com.sonly.state;

public class OpenState implements State{

	static final OpenState instance = new OpenState();
	
	public static State instance() {
		return instance;
	}
	
	@Override
	public void handle(Context context) {
		if(context.getCurrent() == this) {
			 System.out.println("开发: Bug已经看到, 正在处理");
			 context.setCurrent(FixedState.instance);
		}
		context.request();

	}

}
