package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "products")
@Entity
public class Product {
    int id;
    String name;
    List<Item> items = new ArrayList<>();

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @OneToMany(targetEntity = Item.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    @GeneratedValue
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
