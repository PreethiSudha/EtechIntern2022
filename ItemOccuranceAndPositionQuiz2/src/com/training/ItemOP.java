package com.training;

import java.util.Scanner;

public class ItemOP {
//Mistake in this
	public static void main(String[] args) {
		
		int x, n, count = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements we want in an array  : ");
		n = sc.nextInt();
		int y[] = new int[n];
		System.out.println("Enter all of the elements : ");
		for(i=0; i<n; i++) {
			y[i] = sc.nextInt();
		}
		System.out.print("Enter the element which we want to count the occurences : ");
		x=sc.nextInt();
		for(i=0;i<n;i++) {
			if(y[i]==x) {
				count++;
			}
		}
		System.out.println("Number of Occurences of the element : ");
		sc.close();
	}
}
