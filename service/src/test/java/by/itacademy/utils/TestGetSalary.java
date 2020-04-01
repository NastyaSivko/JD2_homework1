package by.itacademy.utils;

import org.junit.jupiter.api.Test;

import static by.itacademy.utils.CalculatorSalary.getSalaryWithoutTax;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class TestGetSalary {

    @Test
    public void getSalaryTest() {
        int salary = 500;
        int tax = 10;

        int result = getSalaryWithoutTax(salary, tax);

        assertEquals(result, 375);
    }

    @Test
    public void getSalaryTest2() {
        int salary = 1000;
        int tax = 0;

        int result = getSalaryWithoutTax(salary, tax);

        assertEquals(result, 850);
    }
}
