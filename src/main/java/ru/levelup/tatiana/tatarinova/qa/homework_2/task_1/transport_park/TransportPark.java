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

        transportPark.vehicles.add(new FordBus(1001, 10.4,4100,2016));
        transportPark.vehicles.add(new VolgaBus(1002,24.1,7000,2018));
        transportPark.vehicles.add(new Trollza(3002,4.6,3500,2019));
        transportPark.vehicles.add(new AvantoTram(2001,7.3,5500,2017));
        transportPark.vehicles.add(new NordTroll(3001,5.2,4200,2018));

        System.out.println("Создаем автопарк: ");
        TransportParkInterface.printTransportPark(vehicles);

        TransportParkInterface.calculateCost(vehicles);

        TransportParkInterface.sortbyFuelConsumption(vehicles);

        TransportParkInterface.searchbyParameters(vehicles);

    }
}
