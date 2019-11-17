package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        int numbers[] = new int[5];
        numbers[0]=2;
        numbers[1]=4;
        numbers[2]=6;
        numbers[3]=8;
        numbers[4]=10;

        double result = ArrayOperations.getAverage(numbers);

        Assert.assertTrue(6==result);
        Assert.assertEquals(6, result, 0.01);
    }

}
