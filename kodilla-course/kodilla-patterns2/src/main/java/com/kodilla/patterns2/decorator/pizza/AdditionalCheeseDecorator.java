package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaOrderDecorator {

    public AdditionalCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getCombination() {
        return super.getCombination() + ", additional cheese";
    }
}
