package com.javalesson.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto bus = new Bus("Mercedes", "Stprinter", busEngine, 30, 75, 12);
        Auto truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 1000);
        Auto car = new ElectricCar("Tesla", "Model S", 4, 100500);


        bus.start();
        bus.stop();
        truck.start();
        truck.stop();

        runCar(bus);
        runCar(car);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }

}
