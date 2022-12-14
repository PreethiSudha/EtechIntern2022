package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "pre_skills_ref")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Skills_Reference {

	
	@Id
	@Column(name="skill_id")
	int skillId;
	
	@Column(name="skill_name")
	String skillName;
	
	@Column(name="skill_type")
	String skillType;
	
	@Column(name="created_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate createdDate;
	
	@Column(name="created_time")
	@DateTimeFormat(iso = ISO.TIME)
	LocalTime createdTime;
	
	@Column(name="created_by")
	String createdBy;
	
}
