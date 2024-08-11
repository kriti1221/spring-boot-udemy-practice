package com.spring.basics.learning_udemy.basics;
import org.springframework.stereotype.Component;


@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] array) {
        System.out.println("using quick sort algorithm");
        return array;
    }

}
