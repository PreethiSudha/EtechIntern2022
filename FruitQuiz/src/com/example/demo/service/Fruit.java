package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fruit {
 
	public static void main (String[] args) {

//To create a new text file 
			try {
				File myFile= new File("File.txt");
				
				if(myFile.createNewFile()) {
					System.out.println("File created:"+myFile.getName());
				}else {
					System.out.println("File Already Exists");
				}
				
			}catch(Exception e) {
				System.out.println("File does not exist");
			}
			
//To be fill the information into the currently created file
			try {
			FileWriter myWriter = new FileWriter("Fruit.txt");
				myWriter.write("Apple is red in colour, "
						+ "Orange is round in shape, "
						+ "Banana is good for health, "
						+ "Grapes will grow as bunch, "
						+ "Mango is a seasonal fruit");
				myWriter.close();
				System.out.println("File was got its information");
				
			}catch(IOException e) {
				System.out.println("Error Occured");
				e.printStackTrace();
			}
			
//To read the file by next&nextline
			try {
				File myFile= new File("Fruit.txt");
				Scanner myReader= new Scanner(myFile);
				while(myReader.hasNextLine())
				{
				String data= myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();	
			}catch(FileNotFoundException e) {
				System.out.println("Error Occured");
				e.printStackTrace();
			}
			
//To concate the file into another file			
			FileInputStream inStream = null;
			FileOutputStream outStream = null;
			
			try {
				File infile= new File("Fruit.txt");
				File outFile=new File("File.txt");
				inStream = new FileInputStream(infile);
				outStream = new FileOutputStream(outFile);
				
				byte[] buffer = new byte[1024];
				
				int length;
				while((length = inStream.read(buffer))>0) 
				{
					outStream.write(buffer,0,length);
				}
				inStream.close();
				outStream.close();
				System.out.println("File was Copied successively");		
			}
			catch(IOException e) {
				e.printStackTrace();
			}

//To delete the Fruit.txt file
			File myFile = new File("Fruit.txt");
			if(myFile.delete()) {
				System.out.println("File Deleted: " +myFile.getName());	
			}else {
				System.out.println("Failed to delete");
			}
			
	}		
}


