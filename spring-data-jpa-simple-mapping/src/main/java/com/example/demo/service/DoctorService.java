package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService {

	private DoctorRepository repo;

	@Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Doctor add(Doctor entity) {
		return this.repo.save(entity);	
	}
	
	public List<Doctor> findAll(){
		return this.repo.findAll();
	}
	
	public List<Doctor> findByDepartment(String dept){
		return this.repo.findByDepartment(dept);
	}
	
	public List<Doctor> findById(int id){
		return this.repo.findById(id);
	}
	
	public Doctor findByDoctorName(String docName) {
		return this.repo.findByDoctorName(docName);
	}
	
	public List<Doctor> findByDoctorNameAndDepartment(String docName, String dept) {
		return this.repo.findByDoctorNameAndDepartment(docName, dept);
	}
	
}
