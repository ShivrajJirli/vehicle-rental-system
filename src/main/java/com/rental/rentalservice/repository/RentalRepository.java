package com.rental.rentalservice.repository;

import com.rental.rentalservice.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
