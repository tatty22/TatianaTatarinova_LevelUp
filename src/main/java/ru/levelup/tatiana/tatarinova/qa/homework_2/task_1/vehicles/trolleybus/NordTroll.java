package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus;

public class NordTroll extends TrolleyBus {

    public NordTroll(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        this.setDisabledAccess(true);
    }
}
