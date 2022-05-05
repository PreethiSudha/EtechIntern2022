package com.training;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of occurences");
		//Question given numbers - 1 5 2 1 2 6 7 1
		int n =sc.nextInt();				
		int[] arr= new int[n];
		int[] arr1= new int[n];	
		System.out.println("Enter the occurence");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		
		// Sorted numbers format - 1 1 1 2 2 5 6 7
		Arrays.sort(arr1);					
		for(int i=0;i<arr1.length;i++){
		int count=0;
		String position = " ";
		if(i==0 || arr1[i-1]!=arr1[i]){
			for(int j=0;j<arr.length;j++){
				if(arr1[i]==arr[j]){
				count++;
				position+=Integer.toString(j)+",";
			}
		}
			System.out.println(arr1[i]+"="+count);
			System.out.println("Position="+position.substring(0,position.length()-1));
		}
		else{
				continue;
			}
		}
	sc.close();
	}
}






	


