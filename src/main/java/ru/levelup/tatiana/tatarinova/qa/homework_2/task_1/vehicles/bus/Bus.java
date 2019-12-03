package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Moveable;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

public abstract class Bus extends Vehicle implements Moveable {


    public Bus(int orderNumber, double fuelConsumption, int cost, int issueYear) {

        super(orderNumber,fuelConsumption,cost,issueYear);
    }

    @Override
    public void move() {
        System.out.println("Автобус едет со средней скоростью 40 км/час.");
    }
}
