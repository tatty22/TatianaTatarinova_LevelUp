package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;


public class FordBus extends Bus {


    public FordBus(double fuelConsumption, int cost, int issueYear, int orderNumber) {
        fuelType = FuelType.DIESEL;
        disabledAccess = false;

        this.orderNumber = orderNumber;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.issueYear = issueYear;
    }
}

