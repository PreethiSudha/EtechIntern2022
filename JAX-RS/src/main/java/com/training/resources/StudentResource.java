package com.training.resources;

import java.util.List;
//import java.util.Optional;

import com.training.model.Student;
import com.training.services.StudentService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("Students")

public class StudentResource {
	
	private static StudentService service = new StudentService();
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getAll(){
//	Student sush = new Student (111, "Sushmitha", 100);
//	return sush;
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
	return this.service.getAll();	
	}
	
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber")int id) {
		 return this.service.findById(id).orElseThrow(()-> new RuntimeException("Id NOT Found"));
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		
		boolean result = this.service.add(student);
		
		if(result) {
			return student;
		}
		else 
		{
			return null;
		}
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		return this.service.remove(id); 
	}
	
	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber")int id, Student newStudent) {
		return service.update(id, newStudent);
	}
			
}
