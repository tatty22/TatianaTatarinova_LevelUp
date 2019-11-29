package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.tram;


public class AvantoTram extends Tram {


    public AvantoTram(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
        setDisabledAccess(true);
    }
}
