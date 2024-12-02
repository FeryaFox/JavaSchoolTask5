package ru.feryafox.Task5;

import java.lang.reflect.Proxy;
import java.time.Duration;
import java.time.LocalDateTime;

public final class Task5 {
    public static void main(String[] args) {
        Calculator delegate = new CalculatorImpl();

        Calculator calculator = (Calculator) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                delegate.getClass().getInterfaces(),
                new CachedInvocationHandler(delegate)
        );
        run(calculator);
    }

    private static void run(Calculator calculator) {
        LocalDateTime start =  LocalDateTime.now();
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(5));
        System.out.println(calculator.calc(6));
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(1));
        System.out.println(calculator.calc(1));
        System.out.println(Duration.between(start, LocalDateTime.now()));

    }
}
