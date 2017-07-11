package com.sonly.builder;

public interface CarBuilder {
	
	void buildEngine();
	
	void buildTyre();
	
	void buildSeat();
	
	Car getResult();
}
