package com.sonly.builder;

public class Engine {
	
	private String description;
	
	public Engine(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Engine{" +
                "description='" + description + '\'' +
                '}';
	}
}
