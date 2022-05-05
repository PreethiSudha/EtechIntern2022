package com.example;

public class Permutation {
	
	private static String swapString(String str, int x, int y) {
		
		char[] j = str.toCharArray();
		
		char ch;
		ch = j[x];
		j[x] = j[y];
		j[y]=ch;
		
		return String.valueOf(j) ;
	}

	
	private static void generatePermutation(String str, int start, int end) {
		
		if(start==end-1) {
			System.out.println(str);	
		}
		else {
			for(int x =start; x<end; x++) {
				str = swapString(str,start,x);
				generatePermutation(str, start+1, end);
				str=swapString(str,start,x);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "cat";
		int len = str.length();
		
		System.out.println("All the Permutations are");
		generatePermutation(str , 0, len);
	}

	

}
