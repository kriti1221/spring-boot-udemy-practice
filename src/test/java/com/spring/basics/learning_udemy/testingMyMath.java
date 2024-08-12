package com.spring.basics.learning_udemy;

import com.spring.basics.learning_udemy.understand_testing.MyMath;
import org.junit.Assert;
import org.junit.Test;

public class testingMyMath {

    MyMath myMath = new MyMath();

    @Test
    public void test(){
        int result = myMath.calculateSum(new int []{1,2,3});
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, result);
        Assert.assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
    }

    @Test
    public void test1(){

        int result = myMath.calculateSum(new int []{});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }
}
