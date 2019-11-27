package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles;

public abstract class Vehicle implements Moveable{
    public enum FuelType { ELECTRICITY, BENZINE, DIESEL, GAS
    }
    public int orderNumber;           // порядковый номер
    public static FuelType fuelType;  // тип топлива
    public double fuelConsumption;    // расход топлива
    public int cost;                 // цена
    public int issueYear;          // год выпуска
    public boolean disabledAccess;    // доступность для лиц с ограниченными возможностями

    @Override
    public String toString() {

        return "  номер: " + orderNumber + "  расход топлива: " + fuelConsumption + "  стоимость: " + cost + " евро  год выпуска: " + issueYear;

        /*
        return "Vehicle{" +
                "orderNumber=" + orderNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", issueYear=" + issueYear +
                ", disabledAccess=" + disabledAccess +
                '}';

         */
    }
}
