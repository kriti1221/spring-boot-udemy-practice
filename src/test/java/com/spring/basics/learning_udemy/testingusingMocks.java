package com.spring.basics.learning_udemy;

import com.spring.basics.learning_udemy.basics.BinarySearchImpl;
import com.spring.basics.learning_udemy.basics.SortAlgorithm;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testingusingMocks {

    @Test
   public void Test(){
        SortAlgorithm mockSortAlgorithm = mock(SortAlgorithm.class);
        when(mockSortAlgorithm.sort(new int[]{3,2,1})).thenReturn(new int[]{1,2,3});
        BinarySearchImpl obj = new BinarySearchImpl(mockSortAlgorithm);
        int result = obj.binarySearch(new int[]{3,2,1},4);
        assertEquals(-1,result);
    }

}
