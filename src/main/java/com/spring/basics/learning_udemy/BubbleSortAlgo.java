package com.spring.basics.learning_udemy;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgorithm {

    public int[] sort(int[] arr) {
        System.out.println("Bubble Sort");
        return arr;
    }
}
