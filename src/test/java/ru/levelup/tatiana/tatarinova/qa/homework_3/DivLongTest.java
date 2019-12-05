package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongTest {
    private Calculator calculator = new Calculator();

    @Test (groups = { "Mult_Div" })
    public void testDivLong() {
        Assert.assertEquals(calculator.div(12345678910L,345678910L),35L);
    }
}
