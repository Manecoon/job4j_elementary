package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x, 2 - this.x) + pow(that.y, 2 - this.y) + pow(that.z, 2 - this.z));
    }
}

