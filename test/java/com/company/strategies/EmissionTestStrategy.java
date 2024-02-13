package com.company.strategies;

import com.company.vehicles.Vehicle;

public class EmissionTestStrategy implements TestingStrategy {
    @Override
    public void applyTest(Vehicle vehicle) {
        // Implement emission test logic
        System.out.println("Performing Emission Test on " + vehicle.getClass().getSimpleName());
    }
}