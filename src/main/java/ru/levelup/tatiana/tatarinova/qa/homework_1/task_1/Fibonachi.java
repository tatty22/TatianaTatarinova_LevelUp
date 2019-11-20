package ru.levelup.tatiana.tatarinova.qa.homework_1.task_1;



public class Fibonachi {

    public double findFibonachi(int num1) {

            int a = 0;
            int b = 1;

            for (int i = 2; i <= num1; ++i) {
                int next = a + b;
                a = b;
                b = next;
            }
            return (double) b;

    }
}
