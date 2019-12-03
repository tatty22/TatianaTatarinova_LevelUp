package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest {
    private Calculator calculator = new Calculator();
    private final double DELTA = 0.1;
    @Test
    public void testSubDouble() {
        Assert.assertEquals(1.190972,calculator.sub(3.589226,2.398254),DELTA);
    }
    @Test
    public void testSubLong() {
        Assert.assertEquals(12345678910L,calculator.sub(24691357909L,12345678999L));
    }
}
