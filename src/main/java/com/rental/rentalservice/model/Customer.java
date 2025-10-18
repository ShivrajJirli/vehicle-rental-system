package com.rental.rentalservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String licenseNumber;
    private String email;
    private String phone;

    public Customer() {}

    public Customer(String id, String name, String licenseNumber, String email, String phone) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.email = email;
        this.phone = phone;
    }

    public String getCustomerInfo() {
        return String.format("%s (ID: %s, License: %s, Email: %s, Phone: %s)",
                name, id, licenseNumber, email, phone);
    }

    public boolean isValidLicense() {
        return licenseNumber != null && licenseNumber.length() >= 5;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
