package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSumDouble() {
        Assert.assertEquals(3.4,calculator.sum(2.3,1.1));
    }

    @Test
    public void testSumLong() {
        Assert.assertEquals(24691357909L,calculator.sum(12345678910L,12345678999L));
    }
}
