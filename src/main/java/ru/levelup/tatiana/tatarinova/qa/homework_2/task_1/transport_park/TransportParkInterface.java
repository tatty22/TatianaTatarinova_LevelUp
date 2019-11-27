package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.transport_park;

import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus.Bus;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus.FordBus;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus.VolgaBus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TransportParkInterface {

    static void calculateCost(ArrayList<Vehicle> vehicles){
        int cost = 0;

        for (Vehicle v : vehicles) {
            cost =cost + v.cost;
        }

        System.out.println("Общая стоимость автопарка: " + cost + " евро.");
    }

    static void printTransportPark(ArrayList<Vehicle> vehicles) {

        System.out.println();
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() + v.toString());
        }
        System.out.println();
    }

    static void sortbyFuelConsumption(ArrayList<Vehicle> vehicles) {

        Collections.sort(vehicles, new SortbyFuelConsumption());
        System.out.println();
        System.out.println("Сортируем машины парка по расходу топлива: ");
        printTransportPark(vehicles);
    }

    // Поиск по заданным параметрам, для простоты считаем, что в автопарке нет машин с одинаковыми параметрами.
    static void searchbyParameters(ArrayList<Vehicle> vehicles) {

        SortbyFuelConsumption fuelConsumption = new SortbyFuelConsumption();
        SortbyCost cost = new SortbyCost();

        Collections.sort(vehicles, fuelConsumption);
        int i  = Collections.binarySearch(vehicles,new FordBus(7.3,3100,2018,1001),fuelConsumption);

        System.out.println("Найдем машины с расходом топлива 7.3 и/или стоимостью 5500: ");
        System.out.println(vehicles.get(i).getClass().getSimpleName() + vehicles.get(i).toString());

        Collections.sort(vehicles, cost);
        int j = Collections.binarySearch(vehicles,new FordBus(7.3,4200,2018,1001),cost);
        System.out.println(vehicles.get(j).getClass().getSimpleName() + vehicles.get(j).toString());
    }
}
