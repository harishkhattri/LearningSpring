package com.hk.spring.basics.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hk.spring.basics.springbasics.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringBasicsBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasicsBasicApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] {12, 6, 4}, 3);
			System.out.println(result);
		}
	}
}
