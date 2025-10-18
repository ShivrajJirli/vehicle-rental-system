package com.rental.rentalservice.repository;

import com.rental.rentalservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
}
