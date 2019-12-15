package com.javaoracle.lesson11.hometask11;

public class TaskMain {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "BMW", 4);
        Car car2 = new Car("Blue", "Zhiguli", 2);

        Car.newDoors(car1, 10);
        Car.newDoors(car2, 10);
        Car.swap(car1, car2);
        System.out.println(car1);
        System.out.println(car2);
    }
}
