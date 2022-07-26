package com.example.demo.dto;

import java.util.List;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BloodDonor;
import com.example.demo.entity.BloodPatient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class Donordto {

	private BloodPatient patient;
	
	private List<BloodDonor> donors;
}
