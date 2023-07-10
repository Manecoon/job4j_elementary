package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

    public static int max(int left, int right, int middle, int top) {
        return max(left, max(right, middle, top));
    }
}