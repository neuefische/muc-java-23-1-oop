package de.neuefische.oop;

public class Car {
    String color;
    String manufacturer;
    int year = 2020;
    String model;

    public String printCar(){
        return  "[Color: " + color + " Manufacturer:  "+ manufacturer + "  Year:  " +year + "  Model:  "+ model+ "]";
    }
}