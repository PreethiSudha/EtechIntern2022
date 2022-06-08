package com.training;
import com.training.model.*;
import com.training.model.VehicleInsurance;

public class Application {
	
	//it will give us a total premium insurance as once it gets run

//	public static void printPremium(Insurance object) {
//		
//		System.out.println("premium = " +object.calculatePremium());
//
//	}
	
	// it will give output as seperate premium insurance as lifeinsurance, vehicleinsurance, healthinsurance
	
	public static void printPremium(LifeInsurance object) {
		
		System.out.println("lifepremium = " +object.calculatePremium());
	}
	
	public static void printPremium(VehicleInsurance object) {
		
		System.out.println("vehiclepremium = " +object.calculatePremium());

	}
	
	public static void printPremium(HealthInsurance object) {
		
		System.out.println("healthpremium = " +object.calculatePremium());

	}
	
	public static void main(String[] args) {
		
		LifeInsurance age = new LifeInsurance(40);
		printPremium(age);
		
		VehicleInsurance Car = new VehicleInsurance(1010, "ramesh", "Car", 2019);
		printPremium(Car);
		
		String[] illness = {"typhoid", "malaria"};
		HealthInsurance health = new HealthInsurance(illness);
		printPremium(health);
	}
}
