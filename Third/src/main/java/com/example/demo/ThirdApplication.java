package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThirdApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(ThirdApplication.class, args);
		Student st = ap.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
