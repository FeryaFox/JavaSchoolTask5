package ru.feryafox.Task1;

import java.util.Calendar;

public final class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.calc(3));
    }
}
