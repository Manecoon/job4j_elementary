package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] == el)) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2};
        System.out.println(indexOf(data, 10));
    }

    public static int indexInRange(int[] data, int min, int i, int i1) {
        return min;
    }
}