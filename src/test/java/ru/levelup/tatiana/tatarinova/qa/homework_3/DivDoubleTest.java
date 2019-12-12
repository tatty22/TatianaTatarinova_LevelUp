package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleTest {

    private Calculator calculator = new Calculator();

    @Test (groups = { "Mult_Div" })
    public void testDivDouble() {
        Assert.assertEquals(calculator.div(24.568, 5.214),4.71192942079018);
    }
}
