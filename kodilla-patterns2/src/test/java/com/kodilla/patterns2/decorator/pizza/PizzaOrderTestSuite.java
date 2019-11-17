package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder basicOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = basicOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder basicOrder = new BasicPizzaOrder();
        //When
        String description = basicOrder.getDescription();
        //Then
        Assert.assertEquals("pizza ordered", description);
    }

    @Test
    public void testPizzaHutOrderGetCost() {
        //Given
        PizzaOrder pizzaHutOrder = new BasicPizzaOrder();
        pizzaHutOrder = new PizzaHutOrderDecorator(pizzaHutOrder);
        pizzaHutOrder = new ExtraCheaseOrderDecorator(pizzaHutOrder);
        pizzaHutOrder = new ExtraLargaPizzaDecorator(pizzaHutOrder);
        //When
        BigDecimal calculatedCost = pizzaHutOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(70), calculatedCost);
    }

    @Test
    public void testPizzaHutGetDescription() {
        //Given
        PizzaOrder pizzaHutOrder = new BasicPizzaOrder();
        pizzaHutOrder = new PizzaHutOrderDecorator(pizzaHutOrder);
        pizzaHutOrder = new ExtraCheaseOrderDecorator(pizzaHutOrder);
        pizzaHutOrder = new ExtraLargaPizzaDecorator(pizzaHutOrder);
        //When
        String description = pizzaHutOrder.getDescription();
        //Then
        Assert.assertEquals("pizza ordered order in Pizzahut + extra chease + ordered XXL pizza", description);
    }
}
