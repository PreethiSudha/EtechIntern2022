package com.training;

import java.util.Set;

import com.training.model.Appointment;
import com.training.model.Doctor;
import com.training.model.Patient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Application {

	public static void main(String[] args) {
		
		Patient pat1 = new Patient(101, "SriVatsan", "AndhraPradesh", 987654321);
		Patient pat2 = new Patient(102, "SriSai", "Chennai", 789456123);
		Patient pat3 = new Patient(103, "Lochan", "KaakiNaada", 653587364);
		Patient pat4 = new Patient(104, "GowriPriya", "Kerala", 847596123);
		
		Set<Patient> patAll = new HashSet<>();
		
		Doctor doc = new Doctor(501, "Dr.Jeevanandham", "Cardiologist", patAll);
		
		patAll.add(pat1);
		patAll.add(pat2);
		patAll.add(pat3);
		patAll.add(pat4);
		
		//System.out.println(patAll);
		//System.out.println(patAll.size());
		//System.out.println(doc);
		
//		System.out.print(doc.getDoctorName());
//		System.out.print("   ");
//		System.out.println(doc.getDepartment());
//		
//		 for( Patient eachPatient : doc.getPatients() ) {
//		 System.out.println(eachPatient);
//		 }
		 
		Patient Pat5 = new 	Patient(105, "Lokesh", "Dindugal", 944746665);
		Patient Pat6 = new 	Patient(106, "Ashwin", "Madurai", 746486844);
		Patient Pat7 = new 	Patient(107, "Abishek", "Kanniyakumari", 961146512);
		Patient Pat8 = new 	Patient(108, "Nesamani", "Dubai", 847854615);
		
		Set<Patient> patAll1 = new HashSet<>();
		
		Doctor doc1 = new Doctor(502, "Dr.Neeli", "Pyschiatrist", patAll1);
		
		patAll1.add(Pat5);
		patAll1.add(Pat6);
		patAll1.add(Pat7);
		patAll1.add(Pat8);
		
//		System.out.print(doc1.getDoctorName());
//		System.out.print("   ");
//		System.out.println(doc1.getDepartment());
//		
//		 for( Patient eachPatient : doc1.getPatients() ) {
//		 System.out.println(eachPatient);
//		 }	
			
		 Map<Doctor , Set<Patient>> map = new HashMap<>();
		 
		 map.put(doc, patAll);
		 map.put(doc1, patAll1);
		 
		 Appointment app = new Appointment(map);
		 System.out.println(app.getPatient(doc));
		 System.out.println(app.getPatient(doc1));
		 
//		System.out.print(doc.getDoctorName());
//		System.out.print("   ");
//		System.out.println(doc.getDepartment());
//		System.out.println(map.get(doc));
//		
//		System.out.println("=============================");
//		
//		System.out.print(doc1.getDoctorName());
//		System.out.print("   ");
//		System.out.println(doc1.getDepartment());
//		System.out.println(map.get(doc1));
	}
		// for map, we id not have any iterators.
}
