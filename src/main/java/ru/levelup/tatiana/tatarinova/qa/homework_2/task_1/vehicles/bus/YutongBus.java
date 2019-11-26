package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;

public class YutongBus extends Bus {


    public YutongBus(double fuelConsumption, int cost, int issueYear, int orderNumber) {
        fuelType = FuelType.BENZINE;
        disabledAccess = true;

        this.orderNumber = orderNumber;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.issueYear = issueYear;
    }
}
