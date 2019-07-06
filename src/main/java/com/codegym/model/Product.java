package com.codegym.model;

public class Product {
    private  int id;
    private String name;
    private float price;
    private int inventory;
    private String category;

    public Product(){}

    public Product(int id, String name, float price, int inventory, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
