package com.kodilla.good.patterns.challenges;

public class ProductOrderServices implements OrderService {

    @Override
    public boolean createOrder(final User user, final Product product, final int productQuantity) {
        System.out.println("Orderd product: " + product.getProductName() + ", for user: "
                + user.getName() + " " + user.getSurname() + ", quantity: "
                + productQuantity + ". Total price: " + product.getPrice()*productQuantity);

        return true;
    }

}