package org.example.abstract_factory.transport.impl.car;

import org.example.abstract_factory.transport.interfaces.Car;

public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 200 km/h");
    }
    @ Override
    public void stop() {
        System.out.println("Stopped at 2 sec");
    }
}
