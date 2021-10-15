package com.calebli.tutorial;

// single line comment

/*
Multi line
comment
 */

/**
 * Javadoc comment
 */

// filename: Car.java
public class Car {
    // this is a class for a car

    // fields and attributes for a car
    private String licencePlate;
    private String color;
    private int modelYear;

    public Car() {
        // this is a constructor for a car
        // it tells Java how to make a car
    }

    public Car(String licencePlate, String color, int modelYear) {
        this.licencePlate = licencePlate;
        this.color = color;
        this.modelYear = modelYear;
    }

    // accessors and mutators for fields of a car
    public String getLicencePlate() {
        return licencePlate;
    }

    public String getColor() {
        return color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    // method that drives the car
    public void drive(int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.println("vroom");
        }
    }
}
