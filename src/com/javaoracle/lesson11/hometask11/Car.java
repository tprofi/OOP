package com.javaoracle.lesson11.hometask11;

class Car {
    private String color;
    private String engine;
    private int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    static void newDoors(Car c1, int i) {
        c1.doors = i;
    }

    static void swap(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color=c2.color;
        c2.color = c3;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", doors=" + doors +
                '}';
    }
}
