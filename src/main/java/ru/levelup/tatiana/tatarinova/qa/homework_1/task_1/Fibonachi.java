package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonachi {

    public static void findFibonachi() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число:");
            String number1 = reader.readLine();

            int num1 = Integer.parseInt(number1);
            int a = 0;
            int b = 1;

            for (int i = 2; i <= num1; ++i) {
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println("Результат вычисления: " + (double) b);
        }
        catch (Exception e) {
            System.out.println("Некорректный формат данных.");
        }
    }
}
