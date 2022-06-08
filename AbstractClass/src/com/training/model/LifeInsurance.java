package com.training.model;

public class LifeInsurance extends Insurance {
	
	private int age;

	public LifeInsurance() {
		super();
	}

	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
	}

	public LifeInsurance(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public double calculatePremium() {
		double lifepremium = 10000;
		if(age<50 )
		{
			lifepremium = 5000;
		}
		
		return lifepremium;
	}


}
