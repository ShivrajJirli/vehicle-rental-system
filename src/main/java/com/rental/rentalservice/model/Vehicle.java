package com.rental.rentalservice.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

    @Id
    private String id;

    private String brand;
    private String model;
    private boolean available;
    private double basePricePerHour;
    private String type;

    public Vehicle() {
        this.available = true;
    }

    public Vehicle(String id, String brand, String model, double basePricePerHour) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.available = true;
        this.basePricePerHour = basePricePerHour;
        this.type = "Generic";
    }

    public double calculateRentalPrice(int hours) {
        return basePricePerHour * hours;
    }

    public String getDetails() {
        return String.format("%s %s (ID: %s) - $%.2f/hr [%s]",
                brand, model, id, basePricePerHour, type);
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public double getBasePricePerHour() { return basePricePerHour; }
    public void setBasePricePerHour(double basePricePerHour) { this.basePricePerHour = basePricePerHour; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
