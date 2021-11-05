package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void sum() {
        assertEquals(2, calc.add(1, 1));
    }
    
}
