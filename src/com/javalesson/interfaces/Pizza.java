package com.javalesson.interfaces;

public class Pizza implements Deliverable {

    private String name;
    private int quantity;
    private int price;
    private Size size;

    public Pizza(String name, int quantity, int price, Size size) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
    }

    @Override
    public int calcDeliveryPrice() {
        if (size == Size.VERY_BIG || quantity > 1)
            return 0;
        else return 7;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}
