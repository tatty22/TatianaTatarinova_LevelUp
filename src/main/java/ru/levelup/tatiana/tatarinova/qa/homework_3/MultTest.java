package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTest {

    private Calculator calculator = new Calculator();
    private final double DELTA = 1.001;

    @Test
    public void testMultLong() {
        Assert.assertEquals(8381143950L,calculator.mult(12345L,678910L));
    }

    @Test
    public void testMultDouble() {
        Assert.assertEquals(22.656,calculator.mult(2.36,9.6),DELTA);
    }
}
