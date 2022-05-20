package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;

import com.example.demo.ifaces.bidirectional.DoctorRepository;
import com.example.demo.ifaces.bidirectional.PatientRepository;

@Component
public class PatientUtils {

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		for(Patient eachPatient: patientList) {
			eachPatient.setDoctor(doc);
			patientRepo.save(eachPatient);
		}
		//doc.setPatientList(patientList);
		Doctor added=repo.save(doc);
		if(added!=null) {
			System.out.println("One Recored added");
		}
	}
	
	public void findAll() {
		
		List<Doctor> doctors=repo.findAll();
		
		for(Doctor eachDoctor:doctors) {
			System.out.println("DoctorName:="+eachDoctor.getDoctorName());
			System.out.println("Department := "+eachDoctor.getDepartment());
			
		List<Patient> patients=eachDoctor.getPatientList();
		
		for(Patient eachPatient:patients) {
			System.out.println("patient Name:="+eachPatient.getPatientName());
			System.out.println("Patient Number:= "+eachPatient.getPhoneNumber());
			}	
		}	
	}
	
	public void findDoctorFrmPatient() {
		Patient entity = patientRepo.findById(204).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
}



























