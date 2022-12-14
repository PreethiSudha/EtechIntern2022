package com.training;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
	
	//let us take specified element as 5
	public static int search(int x[], int key) {
		for(int i=0; i<x.length; i++) {   
            if(x[i] == key){    
                return i;    
           }
        }    
		return key;
	}

	//Main method for implementations
	public static void main(String[] args) {
	
	int arr[];
	arr = new int[10];
	arr[0] = 0;
	
	int x[] = {1,2,3,4,5,6,9,3,7};
	int key = 5;
	
	
	
	// 1 -> get the index position of the speciifed value
	System.out.println("Index Position of the specified value: " +search(x,key));
	
	// 2 -> replaced the index position of the specified value
	Integer a[] = new Integer[] {1,2,3,4,5,6,9,3,7};
	List<Integer> list = Arrays.asList(a);
	list.set(4, 8);
	System.out.println("Array as List: " + list.toString());   

	// 3 -> All possible Iteration of ArrayList
	/*..BY USING FOR LOOP..*/
	for(int i=0;i<a.length;i++) { //using for loop to get all the elements present in the arraylist
		System.out.println(a[i]);
	}
	/*..BY USING ENHANCED FOR LOOP..*/
	for(@SuppressWarnings("unused") Integer arrays : a) {
		System.out.println(Arrays.toString(a));
		break;
	}
	}
//	/*..BY USING FOREACH LOOP..*/
//	public void forEach() {
//		List<Integer> list = Arrays.asList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.forEach(System.out::println); 
//		//System.out.println(list);
//	}
	
//	// 4 -> Reverse arraylist without using reverse method
//	public void reverseArrayList(ArrayList list){
//	ArrayList obj = new ArrayList<>();
//	
//	for(i=x.)
//	}

	
	// 5 -> Remove duplicates from arrayList
	public static void removeDuplicates(ArrayList list){
		ArrayList al = new ArrayList();
		ArrayList.removeDuplicates(list);
		System.out.println(al);
		
//		for(int element : al) {
//			 if (al.contains(element)) {
//	                al.remove(element);
//	            }else {
//	            	al.add(element);
//	            }
//		}
	}
		
}
