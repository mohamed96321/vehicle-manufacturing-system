package com.company.observers;

import com.company.vehicles.Vehicle;

public class AssemblyLineObserver implements VehicleObserver {
    @Override
    public void update(Vehicle vehicle) {
        System.out.println("Assembly line received an update: " + vehicle.getClass().getSimpleName());
    }
}
