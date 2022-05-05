package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	
	@Override
	public String getColor() {
		
		return "Red";
	}

	@Override
	public String getModel() {
		
		return "Maruti Suzuki";
	}

	@Override
	public double getPrice() {
		
		return 85000.0;
	}

}
