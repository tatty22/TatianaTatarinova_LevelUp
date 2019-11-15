package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.startCalc();
    }

    public void startCalc() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выберите операцию: +, -, *, возведение в степень exp, вычисление факториала fact, вычисление числа Фибонначи fib");
        String operation = reader.readLine();

        switch (operation) {
            case "+" : {
                Addition.add();
            }
            break;
            case "-" : {
                Subtraction.subtract();
            }
            break;
            case "*" : {
                Multiplication.multiply();
            }
            break;
            case "exp" : {
                Exponentiation.exponentiate();
            }
            break;
            case "fact" : {
                Factorial.factorize();
            }
            break;
            case "fib" : {
                Fibonachi.findFibonachi();
            }
            break;
            default:
                System.out.println("Вы ввели некорректную операцию;)");
        }
    }
    }