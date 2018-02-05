package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nFirst Unit Test");

        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        if(calculator.add(a,b) == a+b) {
            System.out.println("Test passed for add method");
        } else {
            System.out.println("Test failed for add method");
        }

        if(calculator.subtract(a,b) == a-b) {
            System.out.println("Test passed for subtract method");
        } else {
            System.out.println("Test failed for subtract method");
        }
    }
}
