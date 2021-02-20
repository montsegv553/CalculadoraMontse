package com.garrido_valero_montserrat.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.garrido_valero_montserrat.calculator.Calculator;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() { // Create object before compilation
        calculator = new Calculator();
    }

    /*
     * testCalc() test method
     */
    @Test
    void testCalc() {
        double first = 3;
        String second = "5";

        try {
            Assertions.assertEquals(8, calculator.calc(first, second, '+', 0f));
            Assertions.assertEquals(-2, calculator.calc(first, second, '-', 0f));
            Assertions.assertEquals(15, calculator.calc(first, second, '*', 0f));
            Assertions.assertEquals(0.6, calculator.calc(first, second, '/', 0f));
            Assertions.assertEquals(3d, calculator.calc(first, second, '%', 0f));
            Assertions.assertEquals(243, calculator.calc(first, second, '^', 0f));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
