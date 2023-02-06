package com.ab.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {
	private static final String REST_URL="https://www.equifax.com/getScores";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		int a=10;
	}

}
