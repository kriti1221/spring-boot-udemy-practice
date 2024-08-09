package com.spring.basics.learning_udemy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningUdemyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LearningUdemyApplication.class, args);
		BinarySearchImpl obj =  applicationContext.getBean(BinarySearchImpl.class);
		int result = obj.binarySearch(new int[]{12,3,4} , 4);
		System.out.println(result);
	}
}
