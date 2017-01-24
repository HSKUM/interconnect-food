package com.ibm.microservices.interconnect17.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
		System.out.println("Running "+FoodApplication.class+" via Spring Boot!");
	}
}
