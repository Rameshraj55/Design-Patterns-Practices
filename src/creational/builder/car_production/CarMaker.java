package creational.builder.car_production;

import creational.builder.car_production.builders.CarBuilder;
import creational.builder.car_production.builders.CarManualBuilder;
import creational.builder.car_production.cars.Car;
import creational.builder.car_production.cars.CarManual;
import creational.builder.car_production.director.Director;

public class CarMaker {
    public static void main(String[] args) {
        Director director = new Director();

        // Car Builder
        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built: " + car.getCarType());

        // Manual Builder
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructCityCar(carManualBuilder);
        CarManual carManual = carManualBuilder.getResult();
        System.out.println("\n-----Car Manual built-----\n" + carManual.print());

    }
}
