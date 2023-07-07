package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int j = 0; j < bound; j++) {
            result[j] = j * j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
