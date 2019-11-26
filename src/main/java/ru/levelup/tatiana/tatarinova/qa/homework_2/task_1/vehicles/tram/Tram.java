package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.tram;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Moveable;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

public abstract class Tram extends Vehicle implements Moveable {

    public Tram() {
        fuelType = FuelType.ELECTRICITY;
    }

    @Override
    public void move() {
        System.out.println("Трамвай едет со средней скоростью 30 км/час.");
    }

}
