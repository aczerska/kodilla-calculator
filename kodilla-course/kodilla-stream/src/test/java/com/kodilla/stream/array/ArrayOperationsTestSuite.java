package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = new int[6];
        Array.setInt(numbers,0,1);
        Array.setInt(numbers,1,11);
        Array.setInt(numbers,2,2);
        Array.setInt(numbers,3,12);
        Array.setInt(numbers,4,22);
        Array.setInt(numbers,5,3);

        // When
        double averageValue = ArrayOperations.getAverage(numbers);

        // Then
        double expectedAverageValue = 8.5;
        Assert.assertEquals(expectedAverageValue, averageValue,0);
    }
}
