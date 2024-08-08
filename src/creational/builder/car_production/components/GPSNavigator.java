package creational.builder.car_production.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "Default Route";
    }

    public GPSNavigator(String customRoute){
        this.route = customRoute;
    }

    public String getRoute(){
        return route;
    }
}
