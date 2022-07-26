package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodPatient;
import com.example.demo.repos.BloodPatientRepository;

@Service
public class BloodPatientService {

	@Autowired
	private BloodPatientRepository repo;
	
	public BloodPatient save(BloodPatient entity) {
		return repo.save(entity);
	}
	
	public List<BloodPatient> findAll(){
		return repo.findAll();
	}

	public BloodPatient findByBloodGroup(String name) {
		return repo.findByBloodGroup(name);
	}
	
	public BloodPatient findByLocation(String place) {
		return repo.findByLocation(place);
	}
}
