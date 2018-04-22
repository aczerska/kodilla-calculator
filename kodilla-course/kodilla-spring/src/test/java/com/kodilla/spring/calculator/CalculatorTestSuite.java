package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void CalculatorTestSuite() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double addResult = calculator.add(2, 2);
        double subResult = calculator.sub(2, 2);
        double multiResult = calculator.mul(2, 2);
        double divResult = calculator.div(4, 2);
        // Then
        Assert.assertEquals(4, addResult, 0);
        Assert.assertEquals(0, subResult, 0);
        Assert.assertEquals(4, multiResult, 0);
        Assert.assertEquals(2, divResult, 0);
    }
}
