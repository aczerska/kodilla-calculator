package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AnchoviesDecorator extends AbstractPizzaOrderDecorator {
    public AnchoviesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(6));
    }

    @Override
    public String getCombination() {
        return super.getCombination() + ", anchovies";
    }
}
