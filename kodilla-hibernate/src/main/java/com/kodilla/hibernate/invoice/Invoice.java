package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "invoices")
@Entity
public class Invoice {
    int id;
    String number;
    List<Item> items = new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }

    @GeneratedValue
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = Item.class, mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
