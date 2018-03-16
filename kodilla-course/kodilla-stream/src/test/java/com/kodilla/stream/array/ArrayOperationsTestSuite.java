package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 11;
        numbers[2] = 2;
        numbers[3] = 12;
        numbers[4] = 22;
        numbers[5] = 3;

        // When
        double averageValue = ArrayOperations.getAverage(numbers);

        // Then
        double expectedAverageValue = 8.5;
        Assert.assertEquals(expectedAverageValue, averageValue,0);
    }
}
