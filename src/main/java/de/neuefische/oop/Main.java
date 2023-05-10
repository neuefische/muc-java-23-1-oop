package de.neuefische.oop;

import de.neuefische.oop.bike.Bike;
import de.neuefische.oop.car.Car;

public class Main {


    public static void main(String[] args) {
        // Car = type, Object = bmw
        // int a = 1;
        // Neues Studenten-Objekt erzeugt/ gemacht
        // <Klassentyp> <variablenName> = new <Klassentyp>();

        Car muslimsMercedes = new Car("black");
        Car dirksVw = new Car("black", "VW", 2006, "Passat");

        System.out.println("mit toString: " + dirksVw);
        System.out.println("kein toString: " + new Bike());

    }
}