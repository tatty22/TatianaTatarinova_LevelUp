package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static double num1 = 0;
    static double num2 = 0;
    static String operation;

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.startCalc();
    }


    public void startCalc() {

        CalculatorInterface.input();

        switch (operation) {
            case "+" : {
                CalculatorInterface.printResult(new Addition().add(num1,num2));
            }
            break;
            case "-" : {
                CalculatorInterface.printResult(new Subtraction().subtract((int)num1,(int)num2));
            }
            break;
            case "*" : {
                CalculatorInterface.printResult(new Multiplication().multiply(num1,num2));
            }
            break;
            case "exp" : {
                CalculatorInterface.printResult(new Exponentiation().exponentiate((int)num1,num2));
            }
            break;
            case "fact" : {
                CalculatorInterface.printResult(new Factorial().factorize((int) num1));
            }
            break;
            case "fib" : {
                CalculatorInterface.printResult(new Fibonachi().findFibonachi((int) num1));
            }
            break;
        }
    }
    }