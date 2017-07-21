package org.learning;

/**
 * Created by Zdenca on 6/21/2017.
 */
public class Product {
    private String name;
    private double price;
    private String item;

    public Product(String name, double price, String item, double currentPrice) {
        this.name = name;
        this.price = price;
        this.item = item;
        this.currentPrice = currentPrice;
    }

    private double currentPrice;

    public Product() {
        this.name = "";
        this.price = 0;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
