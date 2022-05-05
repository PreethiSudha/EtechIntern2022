package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		
		return "Black";
	}

	@Override
	public String getModel() {
		
		return "Toyota Vellfire";
	}

	@Override
	public double getPrice() {
		
		return 8600000.0;
	}

}
