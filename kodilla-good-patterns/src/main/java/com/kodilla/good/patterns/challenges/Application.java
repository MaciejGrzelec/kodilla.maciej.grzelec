package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriver = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MailServices(), new ProductOrderServices(), new OrderDataBase());
        orderProcessor.process(orderRequest);
    }
}
