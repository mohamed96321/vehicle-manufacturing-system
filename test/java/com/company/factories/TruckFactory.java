package com.company.factories;

import com.company.vehicles.Truck;
import com.company.vehicles.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
