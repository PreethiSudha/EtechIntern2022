package com.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {

	public static void main(String[] args) {
		Fruits f1 = new Fruits("apple");
		Fruits f2 = new Fruits("orange");
		Fruits f3 = new Fruits("apple");
		Fruits f4 = new Fruits("pineapple");
		Fruits f5 = new Fruits("orange");
        Fruits f6 = new Fruits("banana");

         Set<Fruits> set = new TreeSet<>();
         
         set.add(f1);
         set.add(f2);
         set.add(f3);
         set.add(f4);
         set.add(f5);
         set.add(f6);
         
         System.out.println("The Sorted Fruit Names After Removing the Duplicated Fruits are:");
        
         for(Fruits value : set)
         {
        	 System.out.print(value);
         }

	}

}
