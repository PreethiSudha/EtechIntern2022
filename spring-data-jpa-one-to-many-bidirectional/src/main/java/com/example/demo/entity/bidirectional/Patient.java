package com.example.demo.entity.bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Preethi_Patient_One_To_Many_Bidirection")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

			@Id
			@Column(name="patient_id")
			int patientId;
			
			@Column(name="patient_name")
			String patientName;
			
			@Column(name="phone_number")
			long phoneNumber;

		public Patient(int patientId, String patientName, long phoneNumber) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", patientName=" + patientName + ","
					+ " phoneNumber=" + phoneNumber + "]";
		}
		
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name = "doctor_ref")
		private Doctor doctor;
		
		
	}


