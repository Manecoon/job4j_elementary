package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenwhenCalculateFactorialFor5Then120calc() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenwhenCalculateFactorialFor0Then1calc() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);

    }
}