package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SecondApplication.class, args);
		
		Laptop lp = ap.getBean(Laptop.class);
		Os o = ap.getBean(Os.class);
		
		System.out.println(lp.getBrand());
		System.out.println(lp.getRam());
		System.out.println(o.getName());
		System.out.println(o.getVersion());
	}

}
