package com.sonly.builder;

/**
 *<ul>
 *<li>Description:  
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class Car {

	private Engine engine;
	
	private Tyre tyre;
	
	private Seat seat;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() {
		return "Car{" +
                "engine=" + engine +
                ", tyre=" + tyre +
                ", seat=" + seat +
                '}';
	}
}
