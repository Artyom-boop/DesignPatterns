package org.example.abstract_factory.impl;

import org.example.abstract_factory.interfaces.TransportFactory;
import org.example.abstract_factory.transport.impl.aircraft.Superjet;
import org.example.abstract_factory.transport.impl.car.Niva;
import org.example.abstract_factory.transport.interfaces.Aircraft;
import org.example.abstract_factory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }
    @Override
    public Aircraft createAircraft() {
        return new Superjet();
    }
}
