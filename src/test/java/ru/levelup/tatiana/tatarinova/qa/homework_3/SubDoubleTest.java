package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleTest {
    private Calculator calculator = new Calculator();
    static final double DELTA =0.000000000000001;

    @Test (groups = { "Sum_Sub" })
    public void testSubDouble() {
        Assert.assertEquals(calculator.sub(5.6,2.1),3.5,DELTA);
    }
}
