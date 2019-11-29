package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;

public class YutongBus extends Bus {


    public YutongBus(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        fuelType = FuelType.BENZINE;
        setDisabledAccess(true);
    }
}
