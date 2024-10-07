package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(3,5);

        assertEquals(8, result);

    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(3,5);
        assertEquals(-2, result);
    }
}