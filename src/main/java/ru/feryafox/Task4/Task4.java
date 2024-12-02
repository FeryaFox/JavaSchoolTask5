package ru.feryafox.Task4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class Task4 {
    public static void main(String[] args) throws IllegalAccessException {
        Field[] fields = Task4TestClass.class.getDeclaredFields();

        for (Field field : fields) {
            if (field.getType() == String.class) {
                int modifiers = field.getModifiers();
                if (Modifier.isFinal(modifiers) || Modifier.isStatic(modifiers)) {
                    if (field.getName().equals(field.get(null))) {
                        System.out.printf("String константа совпадает по названию (%s) и значению (%s)\n", field.getName(), field.get(null));
                    }
                    else {
                        System.out.printf("String константа не совпадает по названию (%s) и значению (%s)\n", field.getName(), field.get(null));
                    }
                }
            }
        }
    }
}
