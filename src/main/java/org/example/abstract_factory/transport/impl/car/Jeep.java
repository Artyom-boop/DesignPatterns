package org.example.abstract_factory.transport.impl.car;

import org.example.abstract_factory.transport.interfaces.Car;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 100 km/h");
    }
   @ Override
    public void stop() {
       System.out.println("Stopped at 5 sec");
   }
}
