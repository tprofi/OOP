package com.javalesson.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> pistons = new ArrayList<>();

    Engine () {
    }

    Engine (double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        for (int i = 0; i <= 5; i++)
            this.pistons.add(new Piston(0.3, i));
    }

    public double getVolume () {
        return volume;
    }

    EngineType getEngineType () {
        return engineType;
    }

    public int getPower () {
        return power;
    }

    List<Piston> getPistons () {
        return pistons;
    }
}
