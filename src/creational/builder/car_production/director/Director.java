package creational.builder.car_production.director;

import creational.builder.car_production.builders.Builder;
import creational.builder.car_production.cars.CarType;
import creational.builder.car_production.components.Engine;
import creational.builder.car_production.components.GPSNavigator;
import creational.builder.car_production.components.Transmission;
import creational.builder.car_production.components.TripComputer;

public class Director {

    public void constructCityCar(Builder Ibuilder){
        Ibuilder.setCarType(CarType.CITY_CAR);
        Ibuilder.setSeats(2);
        Ibuilder.setEngine(new Engine(1.2,0));
        Ibuilder.setTransmission(Transmission.AUTOMATIC);
        Ibuilder.setTripComputer(new TripComputer());
        Ibuilder.setGPSNavigator(new GPSNavigator());

    }
}
