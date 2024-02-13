package com.company.vehicles;

public class Car implements Vehicle {
    private boolean assembled;

    @Override
    public void assemble() {
        // Add car assembly logic
        this.assembled = true;
    }

    @Override
    public boolean isAssembled() {
        return assembled;
    }
}
