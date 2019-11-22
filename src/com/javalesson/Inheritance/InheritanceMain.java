package com.javalesson.Inheritance;

import java.util.List;

public class InheritanceMain {
    public static void main (String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

        Truck truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 10000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unLoad();

        System.out.println("\n");

        ElectricCar car = new ElectricCar("Tesla", "Model S", 4, 100500);
        car.start();
        car.stop();
        car.charge();

        System.out.println("\n");

        Engine busEngine = new Engine(2.5, EngineType.PETROL, 250);
        Bus bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        bus.fuelUp();
        bus.pickUpPassenger(5);
        bus.start();
        bus.releasePassenger();


        System.out.println("\n");

        Engine engine = bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston> pistons = engine.getPistons();
        System.out.println(pistons);
    }
}
