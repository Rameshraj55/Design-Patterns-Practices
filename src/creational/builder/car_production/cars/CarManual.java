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

    public String print(){
        String info = "";
        info += "Type of car: " + carType +"\n";
        info += "Number of seats: " + seats +"\n";
        info += "Engine: Volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" +"\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
