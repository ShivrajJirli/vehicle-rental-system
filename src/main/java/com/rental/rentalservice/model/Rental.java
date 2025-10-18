package com.rental.rentalservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Customer customer;

    private int hours;
    private LocalDateTime rentalTime;

    @Embedded
    private Payment payment;

    public Rental() {}

    public Rental(Vehicle vehicle, Customer customer, int hours, Payment payment) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.hours = hours;
        this.payment = payment;
        this.rentalTime = LocalDateTime.now();
    }

    public String generateInvoice() {
        return String.format(
                "Rental Time: %s\n" +
                        "Vehicle: %s\n" +
                        "Customer: %s (License: %s)\n" +
                        "Duration: %d hours\n" +
                        "Total Amount: $%.2f\n" +
                        "Payment Method: %s\n" +
                        "Payment Status: %s",
                rentalTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
                vehicle.getDetails(),
                customer.getName(), customer.getLicenseNumber(),
                hours,
                payment.getAmount(),
                payment.getMethod(),
                payment.isPaid() ? "Paid" : "Pending"
        );
    }

    // Getters and Setters
    public Long getId() { return id; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }

    public LocalDateTime getRentalTime() { return rentalTime; }
    public void setRentalTime(LocalDateTime rentalTime) { this.rentalTime = rentalTime; }
}
