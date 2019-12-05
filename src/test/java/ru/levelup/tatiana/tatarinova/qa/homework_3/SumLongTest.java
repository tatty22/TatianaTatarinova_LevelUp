package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumLongTest {

    private Calculator calculator = new Calculator();

    @Test (groups = { "Sum_Sub" })
    public void testSumLong() {
        Assert.assertEquals(calculator.sum(12345678910L,12345678999L),24691357909L);
    }
}
