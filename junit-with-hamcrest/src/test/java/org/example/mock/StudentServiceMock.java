package org.example.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentServiceMock implements StudentRepository {

	int addCount=0;
	Student lastAdded =null;
	
	@Override
	public Student add(Student entity) {
		addCount++;
		lastAdded=entity;
		return lastAdded;
	}

	@Override
	public List<Student> findAll() {
		return null;
	}
	
	public void verify(Student entity,int count) { 
		
		assertEquals(addCount,count );

		assertEquals(lastAdded,entity );
	}

	@Override
	public int findStudentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student addWithCondition(Student stud) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
