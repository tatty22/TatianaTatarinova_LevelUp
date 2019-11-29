package ru.levelup.tatiana.tatarinova.qa.homework_2.task_1.vehicles;

public abstract class Vehicle implements Moveable{
    public enum FuelType { ELECTRICITY, BENZINE, DIESEL, GAS
    }
    private int orderNumber;           // порядковый номер
    protected static FuelType fuelType;  // тип топлива
    private double fuelConsumption;    // расход топлива
    private int cost;                 // цена
    private int issueYear;          // год выпуска
    private boolean disabledAccess;    // доступность для лиц с ограниченными возможностями

    public Vehicle(int orderNumber, double fuelConsumption, int cost, int issueYear) {
        this.orderNumber = orderNumber;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.issueYear = issueYear;
    }

    @Override
    public String toString() {

        return "  номер: " + orderNumber + "  расход топлива: " + fuelConsumption + "  стоимость: " + cost + " евро  год выпуска: " + issueYear;

        /*
        return "Vehicle{" +
                "orderNumber=" + orderNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", issueYear=" + issueYear +
                ", disabledAccess=" + disabledAccess +
                '}';

         */
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static FuelType getFuelType() {
        return fuelType;
    }

    public static void setFuelType(FuelType fuelType) {
        Vehicle.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public boolean isDisabledAccess() {
        return disabledAccess;
    }

    public void setDisabledAccess(boolean disabledAccess) {
        this.disabledAccess = disabledAccess;
    }
}
