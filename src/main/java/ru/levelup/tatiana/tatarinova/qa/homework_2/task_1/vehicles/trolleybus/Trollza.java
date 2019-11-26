package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus;

public class Trollza extends TrolleyBus {


    public Trollza (double fuelConsumption, int cost, int issueYear, int orderNumber) {

        super();
        disabledAccess = true;

        this.orderNumber = orderNumber;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.issueYear = issueYear;
    }
}
