package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void max4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max7() {
        int left = 5;
        int right = 7;
        int middle = 3;
        int result = Max.max(left, Max.max(right, middle));
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max8() {
        int left = 1;
        int right = 8;
        int middle = 6;
        int top = 4;
        int result = Max.max(left, Max.max(right, Max.max(middle, top)));
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}