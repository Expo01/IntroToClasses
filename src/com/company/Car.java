package com.company;

import java.util.Locale;

public class Car {

    private String color;
    private String make;
    private int doors;
    private boolean hybridOrElectric;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        if (make == null) make = "unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden":
            case "forerunner":
            case "tesla":
                this.make = lowercaseMake;
                 break;
            default:
                this.make = "unsupported";
        }
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setHybridOrElectric(boolean hybridOrElectric) {
        this.hybridOrElectric = hybridOrElectric;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isHybridOrElectric() {
        return hybridOrElectric;
    }

    public void describeCar() {
        System.out.println("car is a " + color + ", " + doors + " door " + make + " and hybridOrElectric capacity is " + hybridOrElectric);
    }
}
