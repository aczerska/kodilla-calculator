package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 1));
        }
        catch (Exception e) {
            System.out.println("This is an exception for this method!\n" + e);
        }
        finally {
            System.out.println("\nRemember if you want to avoid exception read contents of SeconChallange class.");
        }

    }
}
