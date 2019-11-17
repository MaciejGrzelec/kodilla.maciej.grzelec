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
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double addResult = calculator.add(4,2);
        Double subResult = calculator.sub(4,2);
        Double mulResult = calculator.mul(4,2);
        Double divResult = calculator.div(4,2);
        //Then
        Assert.assertEquals(6,addResult,0);
        Assert.assertEquals(2,subResult,0);
        Assert.assertEquals(8,mulResult,0);
        Assert.assertEquals(2,divResult,0);
    }
}