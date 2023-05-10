package de.neuefische.oop.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testIfCarsAreEqual() {
        Car blackMercedes1 = new Car("black");
        Car blackMercedes2 = new Car("black");
        Car redMercedes1 = new Car("black");

        String s1 = "Hallo Welt!";
        String s2 = "Hallo Welt!";

        if(blackMercedes1.equals(blackMercedes2)) {
            System.out.println("Der gleiche Mercedes!");
        } else {
            System.out.println("Sind nicht gleich!");
        }

        assertEquals(blackMercedes1, blackMercedes2);
    }
}