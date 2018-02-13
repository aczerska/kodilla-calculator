package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;


public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("\nTest Suite: end");
    }

    @Before
    public void before() {
        System.out.println("\nTest Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> testEmptyList = new ArrayList<>();

        System.out.println("Listing contents of empty testing table used for comparison:");
        for(Integer testValue : testEmptyList) {
            System.out.println(testValue);
        }
        // When
        ArrayList<Integer> emptyList = exterminator.exterminate(numbers);
        System.out.println("Listing contents of resulting empty table:");
        for(Integer value : emptyList) {
            System.out.println(value);
        }
        // Then
        Assert.assertEquals(testEmptyList, emptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int n = 1; n < 11; n++) {
            numbers.add(n);
        }

        ArrayList<Integer> testEvenValues = new ArrayList<>();
        testEvenValues.add(2);
        testEvenValues.add(4);
        testEvenValues.add(6);
        testEvenValues.add(8);
        testEvenValues.add(10);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        System.out.println("Listing contents of testing table used for comparison with even values:");
        for(Integer testValue : testEvenValues) {
            System.out.println(testValue);
        }
        // When
        ArrayList<Integer> evenValues = exterminator.exterminate(numbers);
        System.out.println("Listing contents of resulting table of even values:");
        for(Integer value : evenValues) {
            System.out.println(value);
        }
        // Then
        Assert.assertEquals(testEvenValues, evenValues);
    }
}
