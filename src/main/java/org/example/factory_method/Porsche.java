package org.example.factory_method;

import org.example.factory_method.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 200 km/h");
    }
    @ Override
    public void stop() {
        System.out.println("Stopped at 2 sec");
    }
}
