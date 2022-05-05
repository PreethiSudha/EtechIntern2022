package com.training.model;

public class Patient {
	
	private int patientId;
	private String patientName;
	private String location;
	private int mobileNumber;
	
	public Patient() {
		super();
	}

	public Patient(int patientId, String patientName, String location, int mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]" ;
	}
	
	

}
