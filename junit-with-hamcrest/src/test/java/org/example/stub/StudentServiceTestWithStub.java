package org.example.stub;

import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentServiceTestWithStub {

	@Test
	@DisplayName(value="Test FindAll Method with stub To return all the elements added")
	void testFindAllMethod() {
		
		StudentRepositoryStub stub = new StudentRepositoryStub();
		StudentService service = new StudentService(stub);
		
		assertEquals(service.findAll().size(),2);
		
	}
}
