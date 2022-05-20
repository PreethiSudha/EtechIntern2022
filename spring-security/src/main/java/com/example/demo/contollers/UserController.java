package com.example.demo.contollers;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class UserController {

//	@GetMapping(path="/users")
//	public String getUser() {
//		return "User Preethi";
//	}
	
//	@GetMapping(path="/users")
//	public String getUSer(Principal principal) {
//		System.out.println("User:=" +principal.getName());
//		System.out.println(principal.toString());
//		return "User Student";
//	}
	
	@GetMapping(path="/users")
	@RolesAllowed(value= {"ROLE_ADMIN"})
	public String getUser() {
		return "User Preethi";
	}
	
	@GetMapping(path="/users/{id}")
	@RolesAllowed(value= {"ROLE_ADMIN", "ROLE_GUEST"})
	public String getUserById(@PathVariable("id") int id) {
		if(id==101) {
		return "User Preethi";
		}
		else {
			return "Manager Manoj";
		}
	}
}
