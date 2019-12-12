package ru.levelup.tatiana.tatarinova.qa.homework_1;



public class Exponentiation {


    public double exponentiate(int num1, double num2) {

            double result = 1;

            for (int i = 0; i < num1; i++) {
                result *= num2;
            }

            return result;
    }
}
