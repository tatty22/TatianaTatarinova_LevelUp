package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Moveable;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

public abstract class TrolleyBus extends Vehicle implements Moveable {

    public TrolleyBus() {
        fuelType = FuelType.ELECTRICITY;
    }

    @Override
    public void move() {
        System.out.println("Троллейбус едет со средней скоростью 35 км/час.");
    }
}
