package com.example.demo.entity.bidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.example.demo.entity.bidirectional.Patient;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Preethi_Doctor_One_To_Many_Bidirection")

@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;
	
	@Column(name="phone_number")
	long phonenumber;
	
	
	@OneToMany(mappedBy="doctor",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	List<Patient> patientList;
	//one to many, one doctor has many patients.


	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", phonenumber=" + phonenumber + "]";
	}


	public Doctor(int doctorId, String doctorName, String department, long phonenumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.phonenumber = phonenumber;
	}

	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public List<Patient> getPatientList() {
		return null;
	}

	
	
	

}
