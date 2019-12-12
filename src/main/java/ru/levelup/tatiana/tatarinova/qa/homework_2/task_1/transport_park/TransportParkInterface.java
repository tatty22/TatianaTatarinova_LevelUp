package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.transport_park;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.Collections;


public class TransportParkInterface {

    static void calculateCost(ArrayList<Vehicle> vehicles){
        int cost = 0;

        for (Vehicle v : vehicles) {
            cost += v.getCost();
        }

        System.out.println("Общая стоимость автопарка: " + cost + " евро.");
    }

    static void printTransportPark(ArrayList<Vehicle> vehicles) {

        System.out.println();
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() + v);
        }
        System.out.println();
    }

    static void sortbyFuelConsumption(ArrayList<Vehicle> vehicles) {

        Collections.sort(vehicles, new SortbyFuelConsumption());
        System.out.println();
        System.out.print("Сортируем машины парка по расходу топлива: ");
        printTransportPark(vehicles);
    }

    // Поиск по заданным параметрам (расход топлива и стоимость):
    static void searchbyParameter(ArrayList<Vehicle> vehicles,double fuelConsumption,int cost) {
        System.out.println("Найдем все машины с расходом топлива " + fuelConsumption + " и стоимостью " + cost);
        for (Vehicle v : vehicles) {
            if (v.getFuelConsumption() == fuelConsumption && v.getCost() == cost) {
                System.out.println(v.getClass().getSimpleName() + v);
            }
        }
    }
}
