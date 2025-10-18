package com.rental.rentalservice.model;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    private boolean sport;

    public Bike() {
        super();
        setType("Bike");
    }

    public Bike(String id, String brand, String model, double basePricePerHour,
                boolean sport) {
        super(id, brand, model, basePricePerHour);
        this.sport = sport;
        setType("Bike");
    }

    @Override
    public double calculateRentalPrice(int hours) {
        double price = super.calculateRentalPrice(hours);
        if (sport) {
            price *= 1.3;
        }
        return price;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + (sport ? " (Sports)" : "");
    }

    public boolean isSport() { return sport; }
    public void setSport(boolean sport) { this.sport = sport; }
}
