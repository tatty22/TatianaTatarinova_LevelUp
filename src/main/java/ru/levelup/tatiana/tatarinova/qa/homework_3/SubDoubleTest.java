package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSubDouble() {
        Assert.assertEquals(3.5,calculator.sub(5.6,2.1));
    }
}
