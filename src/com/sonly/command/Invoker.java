package com.sonly.command;

public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();
	}
}
