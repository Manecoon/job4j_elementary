package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan > nik) {
        } else {
            month = 1;
            while ((ivan *= 3) < (nik *= 2)) {
                month++;
            }
        }
        return month;
    }
}