package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubLongTest {
    private Calculator calculator = new Calculator();

    @Test (groups = { "Sum_Sub" })
    public void testSubLong() {
        Assert.assertEquals(calculator.sub(24691357909L,12345678999L),12345678910L);
    }
}
