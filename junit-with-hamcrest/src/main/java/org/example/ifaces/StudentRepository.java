package org.example.ifaces;

import java.util.List;

import org.example.model.Student;

public interface StudentRepository {

	Student add(Student entity);

	List<Student> findAll();
	
	int findStudentSize();
	
	Student addWithCondition(Student stud);
	
}
