package com.company.factories;

import com.company.vehicles.Car;
import com.company.vehicles.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
