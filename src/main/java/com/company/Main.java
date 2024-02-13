package com.company;

import com.company.factories.CarFactory;
import com.company.factories.TruckFactory;
import com.company.factories.VehicleFactory;
import com.company.observers.AssemblyLineObserver;
import com.company.observers.VehicleObserver;
import com.company.strategies.CrashTestStrategy;
import com.company.strategies.EmissionTestStrategy;
import com.company.strategies.TestingStrategy;
import com.company.vehicles.Vehicle;

import java.util.Observable;  // Import Observable from java.util

@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        // Create factories
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();

        // Create observers
        VehicleObserver assemblyLineObserver = new AssemblyLineObserver();

        // Create testing strategies
        TestingStrategy crashTestStrategy = new CrashTestStrategy();
        TestingStrategy emissionTestStrategy = new EmissionTestStrategy();

        // Create vehicles
        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        // Attach observer
        if (car instanceof Observable) {
            ((Observable) car).addObserver((java.util.Observer) assemblyLineObserver);
        }
        if (truck instanceof Observable) {
            ((Observable) truck).addObserver((java.util.Observer) assemblyLineObserver);
        }

        // Assemble vehicles
        car.assemble();
        truck.assemble();

        // Quality control
        QualityControlManager qualityControlManager = QualityControlManager.getInstance();
        qualityControlManager.performQualityControl(car, crashTestStrategy);
        qualityControlManager.performQualityControl(truck, emissionTestStrategy);
    }
}
