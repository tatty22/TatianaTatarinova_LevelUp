package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongTest {

    private Calculator calculator = new Calculator();

    @Test (groups = { "Mult_Div" })
    public void testMultLong() {
        Assert.assertEquals(calculator.mult(12345L,678910L),8381143950L);
    }
}
