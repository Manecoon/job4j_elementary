package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when010to202then3() {
        Point a = new Point(0, 1, 0);
        Point b = new Point(2, 0, 2);
        double dist = a.distance3d(b);
        double expected = 3;
        assertThat(dist).isCloseTo(expected, offset(0.2));
    }

    @Test
    public void when530to234then5() {
        Point a = new Point(5, 3, 0);
        Point b = new Point(2, 3, 4);
        double dist = a.distance3d(b);
        double expected = 5;
        assertThat(dist).isCloseTo(expected, offset(0.2));
    }

    @Test
    public void when811to632then3() {
        Point a = new Point(8, 1, 1);
        Point b = new Point(6, 3, 2);
        double dist = a.distance3d(b);
        double expected = 3;
        assertThat(dist).isCloseTo(expected, offset(0.3));
    }
}
