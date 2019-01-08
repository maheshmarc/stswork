package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(ModelMap model) {
	
		return "/login";
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String Validate(@RequestParam String firstName, ModelMap model) {
		model.put("firstName", firstName);
	
		return "/login";
		
	}

}
