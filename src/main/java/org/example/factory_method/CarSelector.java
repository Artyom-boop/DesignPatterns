package org.example.factory_method;

public class CarSelector {
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
        }
        return car;
    }
}
