package org.example.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.example.model.Student;
import org.example.service.StudentService;

public class StudentServiceTestWithMock {
	
	@DisplayName(value = "Test verify Add Method with mock")
	@Test
	
	void testAddWithMock() {
		StudentServiceMock mock = new StudentServiceMock();
		StudentService service = new StudentService(mock);
		
		
		Student kavi = new Student(892,"Kavitha");
		Student kaviya = new Student(893,"Kavya");
		
		
		service.add(kavi);
		service.add(kaviya);
		
		
		mock.verify(kaviya,2);
		//mock.verify(kavi,2);
	}
	

}
