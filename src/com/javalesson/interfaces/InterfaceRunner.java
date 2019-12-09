package com.javalesson.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("neopolitana", 1, 20, Size.VERY_BIG);
        Deliverable phone = new CellPhone("Oneplus", "GM1900", 1, 500);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
    }

    private static void printDeliveryPrice(Deliverable del){
        System.out.println("Delivery price "+del);
    }
}

