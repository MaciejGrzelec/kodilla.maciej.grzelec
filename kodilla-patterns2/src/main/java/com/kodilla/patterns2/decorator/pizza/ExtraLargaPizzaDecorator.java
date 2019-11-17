package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraLargaPizzaDecorator extends AbstractPizzaOrderDecorator{

    public ExtraLargaPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    public String getDescription() {
        return super.getDescription() + " + ordered XXL pizza";
    }
}
