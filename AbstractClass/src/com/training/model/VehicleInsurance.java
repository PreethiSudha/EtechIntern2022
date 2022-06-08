package com.training.model;

public class VehicleInsurance extends Insurance {

	private String vehicleModel;
	private int yearOfManufacture;
	
	public VehicleInsurance() {
		super();
	}
	
	public VehicleInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName );
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, String vehicleModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName );
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}


	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}



	public int getYearOfManufacture() {
		return yearOfManufacture;
	}



	public void setYearofManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}



	@Override
	public double calculatePremium() {
		double vehiclepremium = 1000;
		if(yearOfManufacture<2020 && vehicleModel.equals("Car")) {
			vehiclepremium = 2000;
		}
		
		return vehiclepremium;
	}

}

