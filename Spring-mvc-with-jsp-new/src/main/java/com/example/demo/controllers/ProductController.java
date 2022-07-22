package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	
    @Autowired
	private Product entity;
    
    @Autowired
    private ProductRepository repo;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model)
	{
		model.addAttribute("title", "Add Products");
		model.addAttribute("command", entity);
		return "addProduct";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity)
	{
		try
		{
		int rowAdded = this.repo.add(entity);
		return "success";
		}
		catch(Exception e)
		{
		return "failure";
		}
	}
	
	@RequestMapping(value = "/product/search", method = RequestMethod.GET)
	public String search(Model model) {
		model.addAttribute("find", "searchProduct");
		return "searchproduct";
	}
	
	@RequestMapping(value = "/product/search", method = RequestMethod.POST)
	public String show(@RequestParam("id") int id , Model model) {
		Product entity=repo.findById(id);
		model.addAttribute("found",entity);
		return "viewproduct";
	}
	
	@RequestMapping(value="/product/remove", method=RequestMethod.GET)
	public String remove(Model model)
	{
		model.addAttribute("delete","removeProduct");
		return "removeproduct";
	}
	
	@RequestMapping(value="/product/remove",method=RequestMethod.POST)
	public String removeId(@RequestParam("id") int id)
	{ 
     	try {
         int rowDeleted = repo.delete(id);
		 return "deletedsuccess";
     	}
     	catch(Exception e)
     	{
		return "deletionfailed";
     	}
	}
	
	@RequestMapping(value="/product/update",method=RequestMethod.GET)
	public String updateProduct(Model model) {
		model.addAttribute("title","Update Product");
		model.addAttribute("command",entity);
		return "updatedproduct";
	}
	
	@RequestMapping(value="/product/update",method=RequestMethod.POST)
	public String showProduct(@ModelAttribute("id")Product id,Model model) {
		int entity=repo.update(id);
		model.addAttribute("found", entity +" row is updated");
		return "viewproduct";				
	}
}  