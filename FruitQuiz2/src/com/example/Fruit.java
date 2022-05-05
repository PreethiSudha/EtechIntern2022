package com.example;

public class Fruit {

	public static void main(String[] args) {
		
		FruitEntities frtdescription = new FruitEntities();
		
		FruitEntities f1 = new FruitEntities("Apple is red in colour");
		FruitEntities f2 = new FruitEntities("Orange is round in shape");
		FruitEntities f3 = new FruitEntities("Banana is good for health");
		FruitEntities f4 = new FruitEntities("Grapes will grow as bunch");
		FruitEntities f5 = new FruitEntities("Mango is a seasonal fruit");
		
		frtdescription.add(f1, f2, f3, f4, f5);
		
	}
		
}
