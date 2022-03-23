package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void manWeight() {
        float in = 187;
        double expected = 100;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void womanWeight() {
        float in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}