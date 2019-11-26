package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.transport_park;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;

import java.util.ArrayList;

public class TransportParkInterface {

    static int calculateCost(ArrayList<Vehicle> vehicles){
        int cost = 0;

        for (Vehicle v : vehicles) {
            cost =cost + v.cost;
        }
        return cost;
    }

    static void printTransportPark(ArrayList<Vehicle> vehicles) {
        System.out.println();
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() + "  номер: " + v.orderNumber + "  расход топлива: " + v.fuelConsumption + "  стоимость: " + v.cost + " евро  год выпуска: " + v.issueYear);
        }
        System.out.println();
    }
}
