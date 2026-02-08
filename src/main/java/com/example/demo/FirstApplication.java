package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(FirstApplication.class, args);
		Student st = ap.getBean(Student.class);
		System.out.println(st.getRoll());
		System.out.println(st.getName());	
		
	}

}
