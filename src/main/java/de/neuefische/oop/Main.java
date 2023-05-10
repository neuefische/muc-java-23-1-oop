package de.neuefische.oop;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        // Car = type, Object = bmw
        Car bmw = new Car();

        bmw.color = "green";
        bmw.manufacturer = "BMW";
        bmw.year = 2014;
        bmw.model = "3 Series";
        System.out.println(bmw.printCar());


        Car audi = new Car();
        audi.color = "red";
        audi.manufacturer ="Audi";
        audi.model = "A4";
        audi.year = 2019;
        System.out.println(audi.printCar());



        Car mercedes = new Car();
        mercedes.color = "black";
        mercedes.year = 2023;
        mercedes.manufacturer = "Mercedes";
        mercedes.model = "C-Class";

        System.out.println(mercedes.printCar());

    }
}