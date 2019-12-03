package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest {

    private Calculator calculator = new Calculator();
    private final double DELTA = 0.001;

    @Test
    public void testDivLong() {
        Assert.assertEquals(35L,calculator.div(12345678910L,345678910L));
    }

    @Test
    public void testDivDouble() {
        Assert.assertEquals(4.711, calculator.div(24.568, 5.214),DELTA);
    }
}
