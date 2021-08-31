package org.martin.oop_3;

public class Car {
    private String name;
    private int doors;
    private String color;
    private engine engine;

    public Car(String name, int doors, String color, org.martin.oop_3.engine engine) {
        this.name = name;
        this.doors = doors;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public org.martin.oop_3.engine getEngine() {
        return engine;
        /**
         * returns the engine of our car
         * @param engine
         */
    }


    public void setEngine(org.martin.oop_3.engine engine) {
        this.engine = engine;
    }
}
