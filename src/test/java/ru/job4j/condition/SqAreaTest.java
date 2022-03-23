package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
    int expected = 2;
    int p = 6;
    double k = 2;
    double out = SqArea.square(p, k);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3Square4() {
        int expected = 4;
        int p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.3);
    }

    @Test
    public void whenP8K4Square5() {
        int expected = 5;
        int p = 11;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.2);
    }
}