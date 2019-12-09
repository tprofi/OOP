package com.javalesson.interfaces;

public interface Pricable extends Deliverable, Orederable {

    default int calcPrice(){
        return calcDeliveryPrice()+calcOrderPrice();
    }

}
