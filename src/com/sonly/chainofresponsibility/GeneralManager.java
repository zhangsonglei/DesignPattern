package com.sonly.chainofresponsibility;

public class GeneralManager extends Leader {

	protected GeneralManager(Leader superior, String name) {
		super(superior, name);
	}

	@Override
	public void handle(Request request) {
		if (request.getType().equals("请假")) {
			if (request.getCount() <= 30) {
				System.out.println("[ " + request.getName() + "] 请假 [" + request.getCount() + "]天, 总经理 [" + name + "] 审批通过");
			} else {
				System.out.println("[ " + request.getName() + "] 时间太长不予通过");
			}
		} else if (request.getType().equals("涨薪")) {
			if (request.getCount() <= 10000) {
				System.out.println("[ " + request.getName() + "]  涨薪 [" + request.getCount() + "]RMB, 总经理 [" + name + "] 审批通过");
			} else {
				System.out.println("金额太高，不予通过");
			}
		}
	}
}
