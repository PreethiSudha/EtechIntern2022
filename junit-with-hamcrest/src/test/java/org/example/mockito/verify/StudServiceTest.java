package org.example.mockito.verify;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.model.Student;
import org.example.repos.StudRepository;
import org.example.stud.service.StudService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class StudServiceTest {

	@Mock
	StudRepository studRep;
	
	@Mock
	StudService serviceMock;
	
	@InjectMocks
	StudService studService;
	
	//answer got if we have a single student and without using optional
	
	@DisplayName(value="Test the method returns a value or null")
	@Test
	void testElementFindById(){
		
		Student stud = new Student(2020,"nithi");
		
		Mockito.when(studRep.getById(stud.getRollNumber())).thenReturn((stud));
		
		Student expected= studService.getById(2020);
		
		assertEquals(expected, stud);
		
		verify(studRep).getById(stud.getRollNumber());
		
	}
	
	
	//with using optional
	@DisplayName(value="Test the method returns a value or null ")
	@Test
	void testElementFindByIdOptional(){
		
		Student stud1 = new Student(2020,"Nithi");
		Student stud2 = new Student(2021, "Preethi");
		
			//when we directly try to insert the id value as an id
		//Mockito.when(studRep.getById(stud.getRollNumber())).thenReturn((stud1));
		//Mockito.when(studRep.getById(2020)).thenReturn(stud1);
		
			//when the repo method uses Optional<Student>
		when(studRep.findById(stud1.getRollNumber())).thenReturn(Optional.of(stud1));
		
		Student expected = studService.findById(2020);
		
		assertEquals(expected, stud2);
		
		verify(studRep).findById(stud2.getRollNumber());
		
	}
	
	@DisplayName(value="Test the method returns Element not found exception")
	@Test
	void testThrowExceptionWhenElementNotFound() {
	
		Student stud=new Student(2031,"ravi");
		
		when(studRep.getByRollNumber(anyInt())).thenThrow(RuntimeException.class);
		
		Student expected=studService.getById(203);
		
		assertEquals(expected,stud);

	}

	@DisplayName(value="Test the method returns a deleted value or Element not found exception")
	@Test
	void testDeleteById(int id) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(2010, "Geetha"));
		list.add(new Student(2011, "Preetha"));
		list.add(new Student(2013, "Kavya"));
		
		assertNotNull(studService.deleteById(id));
		
	}
	
	@Test
	@DisplayName(value = "Test the value is not found should return ElementNotFound")
	void testdeleteelementFound() {

	Student meena = new Student(2017, "meena");
	Student sachin = new Student(2018, "sachin");
	//stubbing
	Mockito.when(studRep.deleteById(2017)).thenReturn(Optional.of(meena));
	assertNotNull(studService.findById(2017));
	Student expected=studService.deleteById(2017);
	assertEquals(expected,meena);

	}
}
