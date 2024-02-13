package com.company.strategies;

import com.company.vehicles.Vehicle;

public class CrashTestStrategy implements TestingStrategy {
    @Override
    public void testVehicle(Vehicle vehicle) {
        System.out.println("Conducting crash test for " + vehicle.getClass().getSimpleName());
    }
}
