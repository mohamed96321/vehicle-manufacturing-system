package com.company;

import com.company.strategies.TestingStrategy;
import com.company.vehicles.Vehicle;

public class QualityControlManager {
    private static QualityControlManager instance;

    private QualityControlManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized QualityControlManager getInstance() {
        if (instance == null) {
            instance = new QualityControlManager();
        }
        return instance;
    }

    public void performQualityControl(Vehicle vehicle, TestingStrategy testingStrategy) {
        System.out.println("Quality control in progress for " + vehicle.getClass().getSimpleName());
        testingStrategy.testVehicle(vehicle);
        // Additional quality control logic
    }
}
