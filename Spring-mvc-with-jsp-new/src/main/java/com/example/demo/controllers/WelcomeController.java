package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
@RequestMapping("/mvc")
public class WelcomeController {
	
	private ModelAndView mdlView;
	private ProductRepository repo;
	
	@Autowired
	public WelcomeController(ModelAndView mdlView,ProductRepository repo) {
		super();
		this.mdlView = mdlView;
		this.repo=repo;
	}

	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public String getMessage()
	{
		return "welcome";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage()
	{
		List<Product> prdList=repo.findAll();
		mdlView.addObject("list",prdList);
//		mdlView.addObject("msg","Mark List");
		mdlView.setViewName("home");
		return mdlView;
	}
	
}
