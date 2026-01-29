package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Os {
	String name = "windows";
	int version = 11;
	
	
	public Os() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	
	
	
	
	

}
