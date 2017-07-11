package com.sonly.builder;

public class LowCarBuilder implements CarBuilder{

	private Car car = new Car();
	
	@Override
	public void buildEngine() {
		System.out.println("\t\t建造低端引擎");
		car.setEngine(new Engine("低端引擎"));
	}

	@Override
	public void buildTyre() {
		System.out.println("\t\t建造低端轮胎");
		car.setTyre(new Tyre("低端轮胎"));
	}

	@Override
	public void buildSeat() {
		System.out.println("\t\t建造低端座椅");
		car.setSeat(new Seat("低端座椅"));
	}

	@Override
	public Car getResult() {
		return car;
	}

}
