package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles;

public abstract class Vehicle implements Moveable{
    EngineType engineType;
    String manufacturer;
    String issueYear;
    String wearout;   // износ
    boolean disabledAccess;  //доступность для лиц с ограниченными возможностями

}
