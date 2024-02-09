package org.example.facade;

import org.example.facade.car.Door;
import org.example.facade.car.Engine;
import org.example.facade.car.Wheel;

public class CarFacade {

    public void startCar() {
        Door door = new Door();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();

        door.open();
        engine.start();
        wheel.turn();
    }
}
