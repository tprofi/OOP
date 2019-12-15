package com.javalesson.innerclasses;

class CellPhone {
    private String model;
    private String make;
    private Display display;
    private RadioModule gsm;

    public CellPhone(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public void turnOn() {
        initDisplay();
        gsm = new RadioModule();
    }

    public void call(String number) {
        gsm.call(number);
    }

    private void initDisplay() {
        display = new Display();
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
