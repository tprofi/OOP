package com.javalesson.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Pricable pizza = new Pizza("neopolitana", 1, 20, Size.VERY_BIG);
        Pricable phone = new CellPhone("Oneplus", "GM1900", 3, 140);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
    }

    private static void printDeliveryPrice(Pricable del) {
        System.out.println("Delivery price = " + del.calcDeliveryPrice());
        System.out.println("Price is = " + del.calcOrderPrice());
        System.out.println("Price all = " + del.calcPrice());


    }
}

