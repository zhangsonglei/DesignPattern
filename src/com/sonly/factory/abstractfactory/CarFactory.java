package com.sonly.factory.abstractfactory;

public interface CarFactory {
	
	Engine createEngine();
	
	Tyre createTyre();
}
