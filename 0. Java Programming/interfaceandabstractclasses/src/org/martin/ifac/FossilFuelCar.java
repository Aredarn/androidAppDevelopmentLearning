package org.martin.ifac;

import jdk.incubator.vector.VectorOperators;

import java.sql.SQLOutput;

public class FossilFuelCar implements CarInterface, TestInterface {
    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in teh engine caused the engine to start.");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()  +" moves at " + speed + " kmh");
    }

    @Override
    public void printName(String name) {

    }
}
