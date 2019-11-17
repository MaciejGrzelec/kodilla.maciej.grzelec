package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "items")
@Entity
public class Item {
    int id;
    Product product;
    BigDecimal price;
    int quantity;
    BigDecimal value;
    Invoice invoice;

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }

    public Item() {
    }

    @JoinColumn(name = "invoice_id")
    @ManyToOne(cascade = CascadeType.ALL)
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @GeneratedValue
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @JoinColumn(name = "product_id")
    @ManyToOne(cascade = CascadeType.ALL)
    public Product getProduct() {
        return product;
    }

    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "value")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
