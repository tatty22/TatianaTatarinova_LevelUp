package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus;

public class Trollza extends TrolleyBus {


    public Trollza (int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        setDisabledAccess(true);
    }
}
