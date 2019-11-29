package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.transport_park;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

import java.util.Comparator;

public class SortbyCost implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getCost() < o2.getCost()) {
            return 1;
        }
        if (o1.getCost() > o2.getCost()) {
            return -1;
        }

        return 0;
    }
}
