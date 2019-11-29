package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;



public class VolgaBus extends Bus {


    public VolgaBus(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        fuelType = FuelType.GAS;
        setDisabledAccess(true);
    }
}
