package com.training.services;

public class Application {

	public static void main(String[] args) {
		
		StringService service = new StringService();
		
		String city = "CHENNAI";
		
		System.out.println(String.format("%s", city));
		
		System.out.println(String.format("%3$.4f %2$.3f %1$.2f", 100.456, 200.4567, 300.5679));
		int key = 10;
		
		switch(key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
			
		case 2:
			service.stringObjectEquals();
			break;
		
		case 3:
			service.usingTrim("   ramesh   ");
			break;
			
		case 4:
			service.lengthOfString(" ramesh ");
			break;
			
		case 5:
			service.usingSubString("Ramesh");
			break;
		
		case 6:
			service.usingCharAtIndex("ram@abc.com");
			break;
			
		case 7:
			service.usingReplace("Lochak Care Pachak", "Be Mochak ful");
			break;
			
		case 8:
			service.usingConcat("Vanakkam", "Chennai");
			break;
			
		case 9:
			service.usingCompareTo("A", "A");
			service.usingCompareTo("A", "B");
			service.usingCompareTo("C", "B");
			service.usingCompareTo("Kattadhora", "SoonaPaana");
			break;
			
		case 10:
			service.usingStringFormat("RAM", 45.279);
			break;
			
		case 11:
			service.usingStringFormat(15);
			break;
			
		case 12:
			service.usingStringFormat(16, 16);
			break;
			
		case 13:
			service.usingStringFormat("ram", "ram");
			break;
		
		case 14:
			service.usingStringFormat(-493L);
			break;
			
		default:
			break;
		}

	}

}
