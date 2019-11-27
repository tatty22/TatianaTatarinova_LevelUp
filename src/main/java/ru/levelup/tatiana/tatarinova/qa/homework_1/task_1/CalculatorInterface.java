package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorInterface {
    static void input() {

        System.out.println("Выберите операцию: +, -, *, возведение в степень exp, вычисление факториала fact, вычисление числа Фибоначчи fib");
        Scanner in = new Scanner(System.in);
        Calculator.operation = in.nextLine();
        try {
            switch (Calculator.operation) {
                case ("+"):
                case ("*"): {
                    System.out.println("Введите два числа:");
                    Calculator.num1 = in.nextDouble();
                    Calculator.num2 = in.nextDouble();
                }
                break;
                case ("-"): {
                    System.out.println("Введите два числа:");
                    Calculator.num1 = in.nextInt();
                    Calculator.num2 = in.nextInt();
                }
                break;
                case ("exp"): {
                    System.out.println("Введите показатель:");
                    Calculator.num1 = in.nextInt();
                    System.out.println("Введите основание:");
                    Calculator.num2 = in.nextDouble();
                }
                break;
                case ("fact"):
                case ("fib"): {
                    System.out.println("Введите число:");
                    Calculator.num1 = in.nextInt();
                }
                break;
                default: {
                    System.out.println("Вы ввели некорректную операцию. Попробуйте еще раз;)");
                    input();
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Вы ввели число в некорректном формате. Попробуйте еще раз;)");
            input();
        }
        catch (InputMismatchException e) {
            System.out.println("Вы ввели число в некорректном формате. Попробуйте еще раз!;)");
            input();
        }
    }

    static void printResult(double result) {
        System.out.println("Результат вычисления: " + result);
    }
}
