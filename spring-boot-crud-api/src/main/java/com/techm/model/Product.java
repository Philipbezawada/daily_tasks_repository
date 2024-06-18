package com.techm.model;


public class Product {
    private Long id;
    private String name;
    private double price;

    // Getter for ID
    public Long getId() {
        return id;
    }

    // Setter for ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}
