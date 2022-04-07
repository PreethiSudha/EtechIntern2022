package com.training.model;

public class HealthInsurance extends Insurance{
	
	private String[] preExistingDiseases;

	public HealthInsurance() {
		super();
		
	}

	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		
	}

	public HealthInsurance(String[] preExistingDiseases) {
		super();
		this.preExistingDiseases = preExistingDiseases;
	}

	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}

	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}
	
	@Override
	
	public double calculatePremium() {
		 double premium = 10000;
		 
		 for (String eachItem : preExistingDiseases) {
			 if(eachItem.equalsIgnoreCase("BP") || eachItem.equalsIgnoreCase("sugar")) {
				 premium = 15000;
			 }
	 }
		return premium;
	}

}
