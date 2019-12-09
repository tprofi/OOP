package com.javalesson.Inheritance;

public class Auto {
    boolean isRunning;
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;

    Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
    }

    void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto is stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + kmPerHour + " km Per Hour");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    Engine getEngine() {
        return engine;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
