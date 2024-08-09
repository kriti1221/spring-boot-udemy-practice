package com.spring.basics.learning_udemy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningUdemyApplication {

	public static void main(String[] args) {
		BinarySearchImpl obj = new BinarySearchImpl(new BubbleSortAlgo());
		int[] arr = {12,3,4};
		int result = obj.binarySearch(arr , 4);
		System.out.println(result);
	}
}
