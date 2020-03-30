package by.itacademy.utils;

public class CalculatorSalary {
    public static final int PERCENT_ONE = 1;
    public static final int PERCENT_THIRTEEN = 13;

    public static Integer calculatorPercent(Integer salary, Integer tax){
        return ((salary * tax) / 100);
    }

    public static Integer getSalaryWithoutTax(Integer salary, Integer tax){
        Integer fszn = calculatorPercent(salary, tax);
        Integer bgs = calculatorPercent(salary, PERCENT_ONE);
        Integer pod = calculatorPercent(salary, PERCENT_THIRTEEN);
        Integer prof = calculatorPercent(salary, PERCENT_ONE);
        return (salary - fszn - bgs - pod - prof);
    }
}
