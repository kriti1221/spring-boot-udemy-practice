package com.spring.basics.learning_udemy.basics;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
@Primary
public class BubbleSortAlgo implements SortAlgorithm {

    public int[] sort(int[] arr) {
        System.out.println("Bubble Sort");
        return arr;
    }
}
