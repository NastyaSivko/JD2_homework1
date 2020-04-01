package by.itacademy.utils;

import org.junit.jupiter.api.Test;

import static by.itacademy.utils.CalculatorSalary.calculatorPercent;
import static junit.framework.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void Calculator(){
        calculatorPercent(520, 10);
    }

    @Test
    public void CalculatorTest(){
        int salary = 240;
        int tax = 15;

        int result = calculatorPercent(salary, tax);

        assertEquals(result, 36);
    }
}
