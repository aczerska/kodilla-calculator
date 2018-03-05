package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nBeautification task #7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("TEXT",(text -> "abc" + text + "abc"));
        poemBeautifier.beautify("TEXT",(text -> text.replace('T', 't')));
        poemBeautifier.beautify("poem",(text -> "ABC" + text.concat("ABC")));
        poemBeautifier.beautify("poem",(text -> text.toUpperCase()));
        poemBeautifier.beautify("This was a beautiful day",(text -> text.substring(11,24).replace('a', 'A')));

        System.out.println("\nSTREAM");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
