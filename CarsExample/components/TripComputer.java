package CarsExample.components;

import CarsExample.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("CarsExample.cars.Car is started");
        } else {
            System.out.println("CarsExample.cars.Car isn't started");
        }
    }
}