package org.example.abstract_factory;

import org.example.abstract_factory.impl.AmericanFcatory;
import org.example.abstract_factory.impl.RussianFactory;
import org.example.abstract_factory.interfaces.TransportFactory;
import org.example.abstract_factory.transport.interfaces.Aircraft;
import org.example.abstract_factory.transport.interfaces.Car;

public class Start {
    static TransportFactory factory;
    static String country;

    public static void main(String[] args) {

        if (country.equals("Russia")) {
            factory = new RussianFactory();
        } else {
            factory = new AmericanFcatory();
        }

        Car car = factory.createCar();
        Aircraft aircraft = factory.createAircraft();
    }
}
