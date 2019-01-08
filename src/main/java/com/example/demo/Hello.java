package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Hello  {
	 
	public Hello() {
		System.out.println("Hello From Constructor");
	}
	
	public String getFunction() {
		
		return "Hello from member Method";
	}


}
