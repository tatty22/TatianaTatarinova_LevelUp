package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;



public class Factorial {

    public double factorize(int num1){

            double result = 1;

            for (int i = num1; i > 1; i--) {
                result *= i;
            }

            return result;

    }
}
