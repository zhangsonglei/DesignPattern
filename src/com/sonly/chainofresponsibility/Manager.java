package com.sonly.chainofresponsibility;

public class Manager extends Leader {

	protected Manager(Leader superior, String name) {
		super(superior, name);
	}

	@Override
	public void handle(Request request) {
		if (request.getType().equals("请假") && request.getCount() <= 20) {
			System.out.println("[ " + request.getName() + "] 请假 [" + request.getCount() + "]天, 经理 [" + name + "] 审批通过");
		} else if (request.getType().equals("涨薪") && request.getCount() <= 1000) {
			System.out.println("[ " + request.getName() + "]  涨薪 [" + request.getCount() + "]RMB, 经理 [" + name + "] 审批通过");
		} else {
			if (superior != null) {
				superior.handle(request);
			}
		}
	}
}
