package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetailApplication {
	
	public String getMassage() {
		return "Welcome in my ratail application!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RetailApplication.class, args);
	}

}
