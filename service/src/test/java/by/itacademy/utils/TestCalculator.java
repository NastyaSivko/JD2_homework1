package by.itacademy.utils;

import org.junit.jupiter.api.Test;

import static by.itacademy.utils.CalculatorSalary.calculatorPercent;
import static junit.framework.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void Calculator(){
        int salary = 300;
        int tax = 0;

        int result = calculatorPercent(salary, tax);

        assertEquals(result, 0);
    }

    @Test
    public void CalculatorTest(){
        int salary = 240;
        int tax = 15;

        int result = calculatorPercent(salary, tax);

        assertEquals(result, 36);
    }
}
