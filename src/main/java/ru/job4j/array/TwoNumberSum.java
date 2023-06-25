package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length && j != 0) {
            if (target == array[i] + array[j]) {
                int[] newArray = new int[2];
                newArray[0] = i;
                newArray[1] = j;
                return newArray;
            }
            if (target > array[i] + array[j]) {
                i++;
                j++;
            }
            j--;
        }
        return new int[0];
    }
}




