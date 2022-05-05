package com.training.services;

public class StringService {
	
	public void stringEquals(String str1, String str2) {
		
		System.out.println("Is value same : " + str1.equals(str2));
		
		System.out.println("Are they Pointing to same Location: " + (str1==str2));
	}
		
	public void stringObjectEquals() {
		
		String ram = new String("Ram");
		String ramudu = new String("Ram");
		
		System.out.println("Is value same : " + ram.equals(ramudu));
		
		System.out.println("Are they Pointing to same Location: " + (ram==ramudu));
		
	}
	
	public void usingTrim(String name) {
		
		System.out.println("Trim: " +name.trim());
		
		//return name.trim();
	}
	
	public void lengthOfString(String name) {
		//String res = usingTrim(name);
		System.out.println("string Length: " +name.trim().length());
	}
	
	public void usingSubString(String name) {
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	}
	
	public void usingCharAtIndex(String name) {
		
		System.out.println("Index position char @ 3: " +name.indexOf('@'));
		System.out.println("Character at position 3: " +name.charAt(3));
	}
	
	public void usingReplace(String str1, String str2) {
		
		System.out.println("Replaced word: " +str1.replace("Care", "Mochak"));
		System.out.println("Replaced word: " +str2.replace("Mochak", "Care"));
	}
	
	public void usingConcat(String str1, String str2) {
		
		//String  is immutable, cannot change
		System.out.println("Concated word: " +str1.concat(str2));
		
		//String builder is changeable - can changeable
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		
		System.out.println(builder.toString());
	}
	
	public void usingCompareTo(String str1, String str2) {
		
		System.out.println(str1.compareTo(str2));
		
	}
	
	public void usingStringFormat(String str1, double mark) {
		
		String frmtString = String.format("Name %s", str1);
		System.out.println(frmtString);
		System.out.println(String.format("Mark %.2f", mark));
	}
	
	public void usingStringFormat(int mark) {
		
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x", mark));
	}
	
	public void usingStringFormat(int mark1, int mark2) {
		
		System.out.println(String.format("Octal %1$o, Hexa %2$x", mark1, mark2));
	}
	
	public void usingStringFormat(String str1, String str2) {
		
		System.out.println(String.format("%1$s, %2$S", str1, str2));
	
	}
	
	public void usingStringFormat(long value) {
		
		System.out.println(String.format("%+d", value));
	
	}
}
package com.training.services;

public class StringService {
	
	public void stringEquals(String str1, String str2) {
		
		System.out.println("Is value same : " + str1.equals(str2));
		
		System.out.println("Are they Pointing to same Location: " + (str1==str2));
	}
		
	public void stringObjectEquals() {
		
		String ram = new String("Ram");
		String ramudu = new String("Ram");
		
		System.out.println("Is value same : " + ram.equals(ramudu));
		
		System.out.println("Are they Pointing to same Location: " + (ram==ramudu));
		
	}
	
	public void usingTrim(String name) {
		
		System.out.println("Trim: " +name.trim());
		
		//return name.trim();
	}
	
	public void lengthOfString(String name) {
		//String res = usingTrim(name);
		System.out.println("string Length: " +name.trim().length());
	}
	
	public void usingSubString(String name) {
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	}
	
	public void usingCharAtIndex(String name) {
		
		System.out.println("Index position char @ 3: " +name.indexOf('@'));
		System.out.println("Character at position 3: " +name.charAt(3));
	}
	
	public void usingReplace(String str1, String str2) {
		
		System.out.println("Replaced word: " +str1.replace("Care", "Mochak"));
		System.out.println("Replaced word: " +str2.replace("Mochak", "Care"));
	}
	
	public void usingConcat(String str1, String str2) {
		
		//String  is immutable, cannot change
		System.out.println("Concated word: " +str1.concat(str2));
		
		//String builder is changeable - can changeable
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		
		System.out.println(builder.toString());
	}
	
	public void usingCompareTo(String str1, String str2) {
		
		System.out.println(str1.compareTo(str2));
		
	}
	
	public void usingStringFormat(String str1, double mark) {
		
		String frmtString = String.format("Name %s", str1);
		System.out.println(frmtString);
		System.out.println(String.format("Mark %.2f", mark));
	}
	
	public void usingStringFormat(int mark) {
		
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x", mark));
	}
	
	public void usingStringFormat(int mark1, int mark2) {
		
		System.out.println(String.format("Octal %1$o, Hexa %2$x", mark1, mark2));
	}
	
	public void usingStringFormat(String str1, String str2) {
		
		System.out.println(String.format("%1$s, %2$S", str1, str2));
	
	}
	
	public void usingStringFormat(long value) {
		
		System.out.println(String.format("%+d", value));
	
	}
}
