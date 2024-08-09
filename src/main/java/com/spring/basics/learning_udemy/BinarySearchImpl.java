package com.spring.basics.learning_udemy;

public class BinarySearchImpl {

    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int ele){

        //sorting
        //BubbleSortAlgo bubbleSortAlgo = new BubbleSortAlgo();
        //bubbleSortAlgo.sort(numbers);

        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        quickSortAlgorithm.sort(numbers);
        return 3;
    }

}
