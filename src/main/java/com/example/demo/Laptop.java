package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	String brand = "HP";
    int ram = 16;
	
	
	
	public Laptop() {
		super();
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
}
