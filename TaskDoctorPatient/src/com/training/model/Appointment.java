package com.training.model;

import java.util.*;

public class Appointment {
	
	private Map<Doctor , Set<Patient>> map;

	public Appointment() {
		super();
		map = new HashMap<>();
	}

	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		this.map = list;
	}

	public Map<Doctor, Set<Patient>> getList() {
		return map;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		this.map = list;
	}

	public Set<Patient> getPatient(Doctor key){
		return this.map.get(key);
		
	}

}
