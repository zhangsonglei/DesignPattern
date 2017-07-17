package com.sonly.chainofresponsibility;

public class Director extends Leader {

	protected Director(Leader superior, String name) {
		super(superior, name);
	}

	@Override
	public void handle(Request request) {
		if (request.getType().equals("请假") && request.getCount() <= 10) {
			System.out.println("[ " + request.getName() + "] 请假 [" + request.getCount() + "]天, 总监 [" + name + "] 审批通过");
		} else {
			if (superior != null) {
				superior.handle(request);
			}
		}
	}
}
