package com.spring.basics.learning_udemy;

import com.spring.basics.learning_udemy.understand_testing.MyMath;
import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class testingMyMath {

    MyMath myMath = new MyMath();

    @BeforeClass
    public static void beforeAllMethod() {
        System.out.println("Before All Method");
    }

    @Before
    public void beforeEveryMethod(){
        System.out.println("before method");
    }

    @Test
    public void test(){
        int result = myMath.calculateSum(new int []{1,2,3});
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, result);
        Assert.assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        System.out.println("test method");
    }

    @Test
    public void test1(){
        int result = myMath.calculateSum(new int []{});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
        System.out.println("test1 method");
    }

    @After
    public void afterEveryMethod(){
        System.out.println("after method");
    }

    @AfterClass
    public static void AfterAllMethod() {
        System.out.println("After All Method");
    }
}
