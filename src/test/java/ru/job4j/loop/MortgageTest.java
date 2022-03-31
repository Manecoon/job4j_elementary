package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class MortgageTest {

    @Test
    public void when1year() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2year() {
        double amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}