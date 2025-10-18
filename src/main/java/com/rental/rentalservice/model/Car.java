package com.rental.rentalservice.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {

    private int seatCount;
    private boolean luxury;

    public Car() {
        super();
        setType("Car");
    }

    public Car(String id, String brand, String model, double basePricePerHour,
               int seatCount, boolean luxury) {
        super(id, brand, model, basePricePerHour);
        this.seatCount = seatCount;
        this.luxury = luxury;
        setType("Car");
    }

    @Override
    public double calculateRentalPrice(int hours) {
        double price = super.calculateRentalPrice(hours);
        if (luxury) {
            price *= 1.5;
        }
        return price;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + String.format(" - %d seats%s",
                seatCount, luxury ? " (Luxury)" : "");
    }

    public int getSeatCount() { return seatCount; }
    public void setSeatCount(int seatCount) { this.seatCount = seatCount; }

    public boolean isLuxury() { return luxury; }
    public void setLuxury(boolean luxury) { this.luxury = luxury; }
}
