package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal price = order.getPrice();
        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testPizzaOrderWithAdditionalCheeseGetCombination() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AdditionalCheeseDecorator(order);
        //When
        String combination = order.getCombination();
        //Then
        assertEquals("Order: basic Margarita, additional cheese", combination);
        System.out.println(order.getCombination());
        System.out.println(order.getPrice());
    }

    @Test
    public void testPizzaOrderWithAddCheeseOlivesAnchoviesGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AdditionalCheeseDecorator(order);
        order = new OlivesDecorator(order);
        order = new AnchoviesDecorator(order);
        //When
        BigDecimal price = order.getPrice();
        //Then
        assertEquals(new BigDecimal(27), price);
        System.out.println(order.getCombination());
        System.out.println(order.getPrice());
    }


}
