package org.example.abstract_factory.impl;

import org.example.abstract_factory.interfaces.TransportFactory;
import org.example.abstract_factory.transport.impl.aircraft.Boeing;
import org.example.abstract_factory.transport.impl.car.Jeep;
import org.example.abstract_factory.transport.interfaces.Aircraft;
import org.example.abstract_factory.transport.interfaces.Car;

public class AmericanFcatory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Jeep();
    }
    @Override
    public Aircraft createAircraft() {
        return new Boeing();
    }
}
