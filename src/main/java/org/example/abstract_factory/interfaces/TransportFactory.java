package org.example.abstract_factory.interfaces;

import org.example.abstract_factory.transport.interfaces.Aircraft;
import org.example.abstract_factory.transport.interfaces.Car;

// Фабрика по созданию транспортных средств
public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
