package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.ShopService.openOrder(..))" +
        "&& args(theNumber) && target(object)")
    public void logEventOpenOrder(BigDecimal theNumber, Object object){
        LOGGER.info("Open order in class: " + object.getClass().getName() + " ,arguments: " + theNumber);
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.addItem(..))")
    public void logEventAddItem(){
        LOGGER.info("Added item");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.doPayment(..))")
    public void logEventDoPayment(){
        LOGGER.info("Payment done");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.verifyOrder(..))")
    public void logEventVerifyOrder(){
        LOGGER.info("Order verified");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.submitOrder(..))")
    public void logEventSubmitOrder(){
        LOGGER.info("Order submitted");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.cancelOrder(..))")
    public void logEventCancelOrder(){
        LOGGER.info("Order canceled");
    }
}
