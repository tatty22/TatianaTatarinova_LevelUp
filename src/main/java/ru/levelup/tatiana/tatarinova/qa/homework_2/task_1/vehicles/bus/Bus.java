package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Moveable;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

public abstract class Bus extends Vehicle implements Moveable {

    @Override
    public void move() {
        System.out.println("Автобус едет со средней скоростью 40 км/час.");
    }
}
