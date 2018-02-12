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
        System.out.println("Test Suite: end");
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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        // When

        // Then
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int n = 1; n < 11; n++) {
            numbers.add(n);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        // When

        // Then
    }





}
