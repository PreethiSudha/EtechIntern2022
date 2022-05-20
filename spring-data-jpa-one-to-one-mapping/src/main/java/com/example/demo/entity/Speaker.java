package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="preethi_speaker_one_to_one")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Speaker {

	
	@Id
	@Column(name = "id")
	int Id;
	
	@Column(name = "speaker_name")
	String speakerName;
	
	@Column(name = "speaker_quality")
	String speakerQuality;
	
}

