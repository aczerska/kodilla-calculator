package com.kodilla;

public class Calculator {

    public void substraction(int a, int b) {
        int d = a-b;
        System.out.println("DIFF = " + d);
        System.out.println("There you go! Difference is calculated :)");
    }

    public void addition(int a, int b) {
        int c = a+b;
        System.out.println("SUM = " + c);
        System.out.println("There you go! Sum is calculated :)");
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.substraction(10,5);
        calculator.addition(10,5);

    }
}
