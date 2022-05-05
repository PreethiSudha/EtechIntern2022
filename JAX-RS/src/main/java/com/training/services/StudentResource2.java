package com.training.services;

import java.util.List;
import java.util.Optional;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.training.model.Student;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.StatusType;

@Path("students")
public class StudentResource2 {
		
		private static StudentService service=new StudentService();
		
		public StudentResource2() {
			super();
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Student> getAllStudent() {
			return service.getAll();	
		}
		
		@GET
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response findById(@PathParam("rollNumber")int id) {
			
			try
			{
				Student entity=service.findById(id)
			         .orElseThrow(()->new RuntimeException("Id not found"));
				return Response.ok(entity).build();
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
				return Response.ok("id not found").status(400).build();
			}
		}

		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		public Response add(Student student) {
			boolean result=service.add(student);
			if(result) {
				return Response.ok(student).status(201).build();
			}else {
				return Response.status(400,"Not Created").build();
			}
			
		}
		
		@DELETE
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response remove(@PathParam("rollNumber")int id) {
			boolean result= service.remove(id);
			if(result)
			{
				return Response.ok("one resourse deleted").status(204).build();
			}
			else
			{
				return Response.status(400,"not deleted").build();
			}
		}
		
		@PUT
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
		{
			return service.update(id,newStudent);
		}

		

}
