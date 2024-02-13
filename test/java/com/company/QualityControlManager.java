package com.company;

import com.company.strategies.TestingStrategy;
import com.company.vehicles.Vehicle;

public class QualityControlManager {
    private static QualityControlManager instance = new QualityControlManager();

    private QualityControlManager() {
        // private constructor to enforce singleton pattern
    }

    public static QualityControlManager getInstance() {
        return instance;
    }

    public boolean performQualityControl(Vehicle vehicle, TestingStrategy testingStrategy) {
        // Implement your quality control logic here
        testingStrategy.applyTest(vehicle);
        // Return true if the quality control is successful, false otherwise
        return true;  // Change this based on your actual logic
    }
}
