package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (target == array[i] + array[j]) {
                    int[] newArray = new int[2];
                    newArray[0] = i;
                    newArray[1] = j;
                    return newArray;
                }
            }
        }
        return new int[0];
    }
}



