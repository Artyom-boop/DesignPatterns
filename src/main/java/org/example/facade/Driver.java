package org.example.facade;

import org.example.facade.car.Door;
import org.example.facade.car.Engine;
import org.example.facade.car.Wheel;

public class Driver {

    public static void main(String[] args) {
        //Без фасада
        Door door = new Door();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();

        door.open();
        engine.start();
        wheel.turn();

        //С фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }
}
