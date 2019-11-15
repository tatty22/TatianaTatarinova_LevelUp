package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    public static void factorize() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число:");
            String number1 = reader.readLine();

            int num1 = Integer.parseInt(number1);
            int result = 1;

            for (int i = num1; i > 1; i--) {
                result *= i;
            }

            System.out.println("Результат вычисления: " + (double) result);
        }
        catch (Exception e) {
            System.out.println("Некорректный формат данных.");
        }
    }
}
