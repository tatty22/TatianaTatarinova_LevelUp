package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    private Calculator calculator = new Calculator();

    @Test
    @Parameters({"a", "b", "c"})
    public void testSumDouble(double a, double b, double c) {
        Assert.assertEquals(calculator.sum(a,b),c);
    }
}
