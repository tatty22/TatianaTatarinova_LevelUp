package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtraction {

    public static void subtract () throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите два числа:");
            String number1 = reader.readLine();
            String number2 = reader.readLine();
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            System.out.println("Результат вычисления: " + (double) (num1 - num2));
        }
        catch (Exception e) {
            System.out.println("Некорректный формат данных.");
        }
    }
}
