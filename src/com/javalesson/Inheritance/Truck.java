package com.javalesson.Inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck (String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing truck");
    }


    public int getCargoWeight () {
        return cargoWeight;
    }

    public void setCargoWeight (int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load () {
        System.out.println("Cargo loaded");
    }

    public void unLoad () {
        System.out.println("Cargo unloaded");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()-getAvailablePetrol());
    }
}
