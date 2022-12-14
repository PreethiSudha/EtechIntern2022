package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class SkillsReference {

		int skillId;
		String skillType;
		String skillName;
		String createdBy;
		@JsonFormat(pattern="yyyy-MM-dd")
		Date createdDate;
		@JsonFormat(pattern="HH:mm:ss")
		Time createdTime;
		
		
}
