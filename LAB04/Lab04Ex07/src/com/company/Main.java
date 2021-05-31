package com.company;

public class Main {

    public static void main(String[] args) {

        Car[] garage = new Car[3];
        garage[0] = new Car("AA456YY");
        garage[1] = new Car("UU44223");
        garage[2] = new SDCar("II2JD89");

        for (Car c : garage) {
            System.out.println(c);
        }
    }
}

class Car {
    boolean isOn = false;
    String licensePlate = "JohnDoe";

    public Car() {

    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println("new Car");
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Car [isOn=" + isOn + ", licensePlate=" + licensePlate +"]";
    }
}

class SDCar extends Car {
    boolean isSelfDriving = false;

    public SDCar(String licensePlate) {
        super(licensePlate);
        System.out.println("new SDCar");
    }

    @Override
    void turnOn() {
        isSelfDriving = false;
        super.turnOn();
    }

    @Override
    void turnOff() {
        isSelfDriving = false;
        super.turnOff();
    }

    void turnSDOn() {
        isSelfDriving = true;
    }

    void turnSDOff() {
        isSelfDriving = false;
    }

    @Override
    public String toString() {
        return "SDCar [isSelfDriving=" + isSelfDriving + ", isOn=" + isOn + ", licensePlate=" + licensePlate + "]";
    }
}
