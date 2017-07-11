package com.sonly.builder;

public class Seat {

	private String description;
	
	public Seat(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Seat{" +
                "description='" + description + '\'' +
                '}';
	}
}
