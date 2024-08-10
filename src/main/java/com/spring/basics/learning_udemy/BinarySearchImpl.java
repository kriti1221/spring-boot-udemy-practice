package com.spring.basics.learning_udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int ele){

        int[] res= sortAlgorithm.sort(numbers);

        return 3;
    }

}
