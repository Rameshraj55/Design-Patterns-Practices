package creational.builder.car_production.builders;

import creational.builder.car_production.cars.Car;
import creational.builder.car_production.cars.CarType;
import creational.builder.car_production.components.Engine;
import creational.builder.car_production.components.GPSNavigator;
import creational.builder.car_production.components.Transmission;
import creational.builder.car_production.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(carType, seats,engine, transmission, tripComputer,gpsNavigator);
    }
}
