package com.sonly.strategy;

public class Context {
	
	private Strategy strategy;
	
	public void setStrategy(Type type, double... args) {
		if (type == Type.NORMAL) {
			strategy = new Normal();
		} else if (type == Type.DISCOUNT) {
			strategy = new Discount(args[0]);
		} else if (type == Type.REBATE) {
			strategy = new Rebate(args[0], args[1]);
		}
	}
	
	public double getResult(double money) {
		return strategy.acceptCash(money);
	}
	
	public enum Type{
		 NORMAL(0),
		 DISCOUNT(1),
		 REBATE(2);

		private int value;

		Type(int value) {
			this.setValue(value);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}
