package com.spring.basics.learning_udemy.basics;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BinarySearchImpl {

    @Inject
    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int ele){

        int[] res = sortAlgorithm.sort(numbers);

        for (int i = 0; i < res.length; i++){
            if (res[i] == ele){
                return i;
            }
        }
        return -1;
    }

}
