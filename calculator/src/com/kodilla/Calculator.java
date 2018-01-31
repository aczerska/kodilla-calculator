package com.kodilla;

public class Calculator {

    public void calculations(int a, int b) {
        int c = a+b;
        System.out.println("SUM = " + c);
        int d = a-b;
        System.out.println("DIFF = " + d);
        System.out.println("There you go! Calculated :)");
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculations(10,5);

    }
}
