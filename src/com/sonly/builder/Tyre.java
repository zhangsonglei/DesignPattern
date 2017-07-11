package com.sonly.builder;

public class Tyre {
	
	private String description;
	
	public Tyre(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Tyre{" +
                "description='" + description + '\'' +
                '}';
	}
}
