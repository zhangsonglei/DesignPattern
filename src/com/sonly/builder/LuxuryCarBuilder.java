package com.sonly.builder;

public class LuxuryCarBuilder implements CarBuilder{

private Car car = new Car();
	
	@Override
	public void buildEngine() {
		System.out.println("\t\t建造高端引擎");
		car.setEngine(new Engine("高端引擎"));
	}

	@Override
	public void buildTyre() {
		System.out.println("\t\t建造高端轮胎");
		car.setTyre(new Tyre("高端轮胎"));
	}

	@Override
	public void buildSeat() {
		System.out.println("\t\t建造高端座椅");
		car.setSeat(new Seat("高端座椅"));
	}

	@Override
	public Car getResult() {
		return car;
	}

}
