package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;


public class FordBus extends Bus {


    public FordBus(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        setFuelType(FuelType.DIESEL);
        setDisabledAccess(false);
    }
}

