package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.tram;

public class LvsTram extends Tram {

    public LvsTram(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        setDisabledAccess(false);
    }
}
