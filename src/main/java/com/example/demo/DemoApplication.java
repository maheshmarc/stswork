package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private Hello hello;

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(DemoApplication.class, args);
		String[] beannames =cac.getBeanDefinitionNames();
		Hello hello = (Hello) cac.getBean(Hello.class);
		System.out.println(hello.getFunction());
		Arrays.sort(beannames);
		for (String beanname : beannames) {
			System.out.println(beanname);
			
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
