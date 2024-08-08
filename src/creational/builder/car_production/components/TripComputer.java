package creational.builder.car_production.components;

import creational.builder.car_production.cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: "+car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is Started");
        } else {
            System.out.println("Car isn't started");
        }
    }




}
