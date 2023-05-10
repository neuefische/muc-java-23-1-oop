package de.neuefische.oop.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testIfBlackCarsAreEqual() {
        Car blackMercedes1 = new Car("black");
        Car blackMercedes2 = new Car("black");

        assertEquals(blackMercedes1, blackMercedes2);
    }

    @Test
    void testIfRedAndCarsAreNotEqual() {
        Car blackMercedes1 = new Car("black");
        Car redMercedes1 = new Car("red");

        assertNotEquals(blackMercedes1, redMercedes1);
    }
}