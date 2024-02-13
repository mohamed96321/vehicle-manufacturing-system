package com.company.vehicles;

public class Truck implements Vehicle {
    private boolean assembled;

    @Override
    public void assemble() {
        // Add truck assembly logic
        this.assembled = true;
    }

    @Override
    public boolean isAssembled() {
        return assembled;
    }
}
