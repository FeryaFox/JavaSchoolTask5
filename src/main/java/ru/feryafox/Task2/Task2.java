package ru.feryafox.Task2;

import java.lang.reflect.Method;

public final class Task2 {
    public static void main(String[] args) {
        Class<TestChildClass> clazz = TestChildClass.class;


        System.out.printf("Методы класса %s: \n", clazz.getName());
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        System.out.println();
        Class<? super TestChildClass> clazz1 = clazz.getSuperclass();

        System.out.printf("Методы класса %s (родительский класс %s): \n", clazz1.getName(), clazz.getName());
        for (Method method : clazz1.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
