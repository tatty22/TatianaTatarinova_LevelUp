package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiation {


    public static void exponentiate() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите два числа:");
            String number1 = reader.readLine();
            String number2 = reader.readLine();

            int num1 = Integer.parseInt(number1);
            double num2 = Double.parseDouble(number2);
            double result = 1;

            for (int i = 0; i < num1; i++) {
                result *= num2;
            }

            System.out.println("Результат вычисления: " + result);
        }
        catch (Exception e) {
            System.out.println("Некорректный формат данных.");
        }
    }
}
