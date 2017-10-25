package com.hk.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hk.spring.basics.springbasics.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicsBasicApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12, 6, 4}, 3);
		System.out.println(result);
	}
}
