package ru.feryafox.Task6;

import java.lang.reflect.Proxy;

public final class Task6 {
    public static void main(String[] args) {
        Calculator delegate = new CalculatorImpl();

        Calculator calculator = (Calculator) Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                new MetricInvocationHandler(delegate)
        );

        System.out.println(calculator.calc(5));
        System.out.println(calculator.calc(1));
    }
}
