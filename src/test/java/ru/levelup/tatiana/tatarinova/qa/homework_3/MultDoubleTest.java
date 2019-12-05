package ru.levelup.tatiana.tatarinova.qa.homework_3;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleTest {
    private Calculator calculator = new Calculator();

    @Test (groups = { "Mult_Div" })
    public void testMultDouble() {
        Assert.assertEquals(calculator.mult(2.36,9.6),22.0); // т.к. public double mult(double a, double b) {return Math.floor(a * b); }
    }
}
