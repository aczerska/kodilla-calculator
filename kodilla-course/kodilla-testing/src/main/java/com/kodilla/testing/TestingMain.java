package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        // Testing SimpleUser
        System.out.println("\nTesting SimpleUser class:");
        SimpleUser simpleUser = new SimpleUser("JohnnyBravo", "John John");

        String result = simpleUser.getUsername();

        if (result.equals("JohnnyBravo")){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        // Testing Calculator
        System.out.println("\nTesting Calculator class:");
        Calculator calculator = new Calculator();
        int resultSub = calculator.subtract(10,5);
        int resultAdd = calculator.add(5,5);

        if(resultSub == 5) {
            System.out.println("Add method works!");
        } else {
            System.out.println("Add method failed!");
        }

        if(resultAdd == 10) {
            System.out.println("Subtract method works!");
        } else {
            System.out.println("Subtract method failed!");
        }
    }
}
