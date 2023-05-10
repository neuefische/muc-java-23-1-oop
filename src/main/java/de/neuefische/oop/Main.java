package de.neuefische.oop;

import de.neuefische.oop.car.Car;

public class Main {


    public static void main(String[] args) {
        // Car = type, Object = bmw
        // int a = 1;
        // Neues Studenten-Objekt erzeugt/ gemacht
        // <Klassentyp> <variablenName> = new <Klassentyp>();

        Car muslimsMercedes = new Car("black");

        Car dirksVw = new Car("black", "VW", 2006, "Passat");

        // Kommen hier die Werte aus dem Konstruktor raus?
        System.out.println(dirksVw.printCar());

//        dirksVw.setColor("black");
//        dirksVw.setManufacturer("VW");
//        dirksVw.setYear(2006);
//        dirksVw.setModel("Passat");











        dirksVw.getColor();

        dirksVw.setEmissionRanking("B");

        dirksVw.setColor("black");
        dirksVw.setManufacturer("BMW");
        dirksVw.setYear(2014);
        dirksVw.setModel("3 Series");

//        System.out.println(dirksVw.printCar());
//
//        Car audi = new Car();
//        audi.color = "red";
//        audi.manufacturer ="Audi";
//        audi.model = "A4";
//        audi.year = 2019;
//        System.out.println(audi.printCar());
//
//        Car mercedes = new Car();
//        mercedes.color = "black";
//        mercedes.year = 2023;
//        mercedes.manufacturer = "Mercedes";
//        mercedes.model = "C-Class";

//        System.out.println(mercedes.printCar());

    }
}