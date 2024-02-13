package com.company.strategies;

import com.company.vehicles.Vehicle;

public class EmissionTestStrategy implements TestingStrategy {
    @Override
    public void testVehicle(Vehicle vehicle) {
        System.out.println("Conducting emission test for " + vehicle.getClass().getSimpleName());
    }
}
