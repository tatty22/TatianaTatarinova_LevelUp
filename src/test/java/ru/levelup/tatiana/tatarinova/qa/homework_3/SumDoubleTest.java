package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTest {

    private Calculator calculator = new Calculator();

    @Test (groups = { "Sum_Sub" })
    public void testSumDouble() {
        Assert.assertEquals(calculator.sum(2.3,1.1),3.4);
    }

}
