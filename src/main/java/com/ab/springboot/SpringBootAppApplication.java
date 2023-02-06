package com.ab.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {
	private Map<String,Object> cache = new HashMap<String,Object>();	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		int a=10;
	}
	
	//HIS-301 changes
	public void loadDataToCache(){
		//logic
	}
}
