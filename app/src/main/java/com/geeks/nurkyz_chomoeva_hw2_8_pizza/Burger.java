package com.geeks.nurkyz_chomoeva_hw2_8_pizza;

public class Burger {
    private String name;
    private double price;
    private final int imageBurger;

    public int getImageBurger() {
        return imageBurger;
    }

    public Burger(String name, double price, int imageBurger) {
        this.name = name;
        this.price = price;
        this.imageBurger = imageBurger;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
