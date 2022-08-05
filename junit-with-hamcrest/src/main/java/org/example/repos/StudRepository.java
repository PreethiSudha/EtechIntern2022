package org.example.repos;

import java.util.Optional;

import org.example.model.Student;

public interface StudRepository {
	
	Optional<Student> findById(int id);
	
	Student getById(int id);
	
	Optional<Student> deleteById(int id);

	Student getByRollNumber(int anyInt);

}
