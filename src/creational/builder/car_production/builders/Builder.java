package creational.builder.car_production.builders;

import creational.builder.car_production.cars.CarType;
import creational.builder.car_production.components.Engine;
import creational.builder.car_production.components.GPSNavigator;
import creational.builder.car_production.components.Transmission;
import creational.builder.car_production.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
