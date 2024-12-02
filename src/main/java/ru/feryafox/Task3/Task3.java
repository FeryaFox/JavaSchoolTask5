package ru.feryafox.Task3;

import java.lang.reflect.Method;

public final class Task3 {
    public static void main(String[] args) {
        Class<Task3TestClass> clazz = Task3TestClass.class;

        System.out.printf("Все геттеры класса %s:\n", clazz.getName());

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getName().startsWith("get")
                    && method.getParameterTypes().length == 0
                    && method.getReturnType().equals(String.class)) {

                System.out.println(method.getName());
            }
        }
    }
}
