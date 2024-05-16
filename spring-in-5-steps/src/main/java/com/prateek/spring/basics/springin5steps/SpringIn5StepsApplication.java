package com.prateek.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
//		BinarySearchImpl bin = applicationContext.getBean
		
		int result = binarySearch.binarySearch(new int[]{12,4,3},3);
		System.out.println(result);
	}

}
		