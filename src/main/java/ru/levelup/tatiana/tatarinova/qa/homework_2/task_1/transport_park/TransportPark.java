package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.transport_park;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.Vehicle;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus.FordBus;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.bus.VolgaBus;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.tram.AvantoTram;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus.NordTroll;
import ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles.trolleybus.Trollza;

import java.util.ArrayList;


public class TransportPark {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        TransportPark transportPark = new TransportPark();

        transportPark.vehicles.add(new FordBus(10,3200,2016,1001));
        transportPark.vehicles.add(new VolgaBus(24,7000,2018,1002));
        transportPark.vehicles.add(new AvantoTram(7,5500,2017,2001));
        transportPark.vehicles.add(new NordTroll(5,4200,2018,3001));
        transportPark.vehicles.add(new Trollza(5,3500,2019,3002));

        System.out.println("Создаем автопарк: ");
        TransportParkInterface.printTransportPark(vehicles);

        System.out.println("Общая стоимость автопарка: " + TransportParkInterface.calculateCost(vehicles) + " евро.");

    }
}
