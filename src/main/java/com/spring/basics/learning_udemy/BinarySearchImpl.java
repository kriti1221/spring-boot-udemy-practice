package com.spring.basics.learning_udemy;

public class BinarySearchImpl {

    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int ele){

        int[] res= sortAlgorithm.sort(numbers);
        System.out.println(res);

        return 3;
    }

}
