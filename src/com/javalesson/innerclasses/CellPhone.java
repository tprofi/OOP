package com.javalesson.innerclasses;

public class CellPhone {
    private String model;
    private String make;
    private  Display display;

    public CellPhone(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public void turnOn(){
        initDisplay();
    }

    private void initDisplay(){
        display= new Display();
    }

    public Display getDisplay() {
        return display;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}
