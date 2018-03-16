package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = {1,11,2,12,22,3};

        // When
        double averageValue = ArrayOperations.getAverage(numbers);

        // Then
        double expectedAverageValue = 8.5;
        Assert.assertEquals(expectedAverageValue, averageValue,0);
    }
}
