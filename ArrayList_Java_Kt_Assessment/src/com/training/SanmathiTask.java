package com.training;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.ListIterator;
public class SanmathiTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");

		System.out.println(obj);
		System.out.println("+++++++++++++++++++++");
		for(int i = obj.size()-1;i>=0;i--) {
			System.out.println(obj.get(i));
		}
		System.out.println("+++++++++++++++++++++");
		ListIterator<String> it = obj.listIterator(obj.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());	
		}
		System.out.println("+++++++++++++++++++++");
		Iterator<String> itr = obj.iterator();
		System.out.println(itr.hasNext());
		System.out.println("+++++++++++++++++++++");
		System.out.println(itr.next());
		System.out.println("+++++++++++++++++++++");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		}

}
