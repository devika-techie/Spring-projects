package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int roll = 11;
	String name = "Devika";
	
	
	public Student() {
		super();
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
