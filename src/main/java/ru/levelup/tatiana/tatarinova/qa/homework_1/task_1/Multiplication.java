package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {


    public static void multiply() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите два числа:");
            String number1 = reader.readLine();
            String number2 = reader.readLine();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            System.out.println("Результат вычисления: " + (num1 * num2));
        }
        catch (Exception e) {
            System.out.println("Некорректный формат данных.");
        }
    }
}
