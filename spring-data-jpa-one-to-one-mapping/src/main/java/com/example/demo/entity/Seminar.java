package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="preethi_seminar_one_to_one")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Seminar {
 
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "duration")
	int duration;
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seminar_ref")
	private Speaker speaker;
	
}
