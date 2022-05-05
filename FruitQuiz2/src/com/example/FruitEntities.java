package com.example;

public class FruitEntities {

	private String Fruits;

	public FruitEntities() {
		super();
	}

	public FruitEntities(String fruits) {
		super();
		Fruits = fruits;
	}

	public String getFruits() {
		return Fruits;
	}

	public void setFruits(String fruits) {
		Fruits = fruits;
	}

	@Override
	public String toString() {
		return "Fruit [Fruits=" + Fruits + "]";
	}

	public String add(FruitEntities f1, FruitEntities f2, FruitEntities f3, FruitEntities f4, FruitEntities f5) {
		return Fruits;
		
	}

	

	
	
	
}
