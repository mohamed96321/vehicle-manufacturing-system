package com.company.strategies;

import com.company.vehicles.Vehicle;

public class CrashTestStrategy implements TestingStrategy {
    @Override
    public void applyTest(Vehicle vehicle) {
        // Implement crash test logic
        System.out.println("Performing Crash Test on " + vehicle.getClass().getSimpleName());
    }
}