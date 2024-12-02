package ru.feryafox.Task5;

public interface Calculator {
    @Cache
    int calc(int arg);
}