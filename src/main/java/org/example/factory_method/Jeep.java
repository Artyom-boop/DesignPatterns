package org.example.factory_method;

import org.example.factory_method.Car;

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
