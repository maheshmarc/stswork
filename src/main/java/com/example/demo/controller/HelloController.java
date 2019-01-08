package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("rest/hello")
	public String sayHello()
	{
		return "Hello World";
	}
	
	@Autowired
	HelloWeb helloWeb;
	
	@GetMapping("/rest/helloWeb")
	public HelloWeb helloWithObject() {
		helloWeb.setMessage("Hello Web from Bean");
		return helloWeb;
	}
}
