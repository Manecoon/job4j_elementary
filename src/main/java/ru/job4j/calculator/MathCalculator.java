package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumRaznostDel(double first, double second) {
        return raznost(first, second) + delenie(first, second);
    }

    public static double sumVseh(double first, double second) {
        return sum(first, second) + multiply(first, second) + raznost(first, second) + delenie(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumRaznostDel(10, 20));
        System.out.println("Результат расчета равен: " + sumVseh(10, 20));
    }
}