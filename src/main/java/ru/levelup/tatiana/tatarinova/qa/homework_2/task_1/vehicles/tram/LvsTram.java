package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.tram;

public class LvsTram extends Tram {

    public LvsTram(double fuelConsumption, int cost, int issueYear, int orderNumber) {
        super();
        disabledAccess = false;

        this.orderNumber = orderNumber;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.issueYear = issueYear;
    }
}
