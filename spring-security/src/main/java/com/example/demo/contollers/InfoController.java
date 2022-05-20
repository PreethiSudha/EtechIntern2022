package com.example.demo.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

	@GetMapping(path="/info")
	public String getUser() {
		return "Un Secured EndPoint";
	}
}
