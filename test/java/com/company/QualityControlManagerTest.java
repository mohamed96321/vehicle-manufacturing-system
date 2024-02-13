package com.company;

import com.company.factories.CarFactory;
import com.company.factories.TruckFactory;
import com.company.factories.VehicleFactory;
import com.company.strategies.CrashTestStrategy;
import com.company.strategies.EmissionTestStrategy;
import com.company.strategies.TestingStrategy;
import com.company.vehicles.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QualityControlManagerTest {

    @Test
    public void testPerformQualityControl() {
        // Create factories and strategies
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        TestingStrategy crashTestStrategy = new CrashTestStrategy();
        TestingStrategy emissionTestStrategy = new EmissionTestStrategy();

        // Create vehicles
        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        // Perform quality control with different strategies
        QualityControlManager qualityControlManager = QualityControlManager.getInstance();

        // Perform quality control with CrashTestStrategy
        boolean carQualityControlResult = qualityControlManager.performQualityControl(car, crashTestStrategy);
        assertTrue(carQualityControlResult);

        // Perform quality control with EmissionTestStrategy
        boolean truckQualityControlResult = qualityControlManager.performQualityControl(truck, emissionTestStrategy);
        assertTrue(truckQualityControlResult);
    }
}
