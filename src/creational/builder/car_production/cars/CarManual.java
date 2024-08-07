package creational.builder.car_production.cars;

import creational.builder.car_production.components.Engine;
import creational.builder.car_production.components.GPSNavigator;
import creational.builder.car_production.components.Transmission;
import creational.builder.car_production.components.TripComputer;

public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarManual(CarType carType, int seats, Engine engine, Transmission transmission,
                     TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}
