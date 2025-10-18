package com.rental.rentalservice.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {

    private double amount;
    private String method;
    private boolean paid;

    public Payment() {}

    public Payment(double amount) {
        this.amount = amount;
        this.paid = false;
    }

    public void process() {
        if (method == null || method.isEmpty()) {
            throw new RuntimeException("Payment method not specified");
        }
        this.paid = true;
    }

    // Getters and Setters
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public boolean isPaid() { return paid; }
    public void setPaid(boolean paid) { this.paid = paid; }
}
