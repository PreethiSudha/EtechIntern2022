package com.training;
import com.training.model.*;
import com.training.model.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
		
		System.out.println("premium = " +object.calculatePremium());

	}
	
	public static void printPremium(LifeInsurance object) {
		
		System.out.println("premium = " +object.calculatePremium());
	}
	
	
	public static void main(String[] args) {
		
		VehicleInsurance Car = new VehicleInsurance(1010, "ramesh", "Car", 2019);
		printPremium(Car);
		
		LifeInsurance age = new LifeInsurance(40);
		printPremium(age);
		
		String[] illness = {"typhoid", "malaria"};
		HealthInsurance health = new HealthInsurance(illness);
		printPremium(health);
	}
}
