package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheaseOrderDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheaseOrderDecorator(PizzaOrder pizzaOrder){
            super(pizzaOrder);
        }
        @Override
        public BigDecimal getCost(){
            return super.getCost().add(new BigDecimal(20));
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " + extra chease";
        }
}
