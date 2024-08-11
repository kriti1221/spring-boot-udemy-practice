package com.spring.basics.learning_udemy.basics;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BinarySearchImpl {

    @Inject
    SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int ele){

        int[] res = sortAlgorithm.sort(numbers);

        return 3;
    }

}
