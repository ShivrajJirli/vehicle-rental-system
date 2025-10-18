package com.rental.rentalservice.controller;

import com.rental.rentalservice.model.Vehicle;
import com.rental.rentalservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable String id) {
        return vehicleRepository.findById(id);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicleDetails) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow();
        vehicle.setBrand(vehicleDetails.getBrand());
        vehicle.setModel(vehicleDetails.getModel());
        vehicle.setType(vehicleDetails.getType());
        vehicle.setAvailable(vehicleDetails.isAvailable());
        vehicle.setBasePricePerHour(vehicleDetails.getBasePricePerHour());
        return vehicleRepository.save(vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable String id) {
        vehicleRepository.deleteById(id);
    }
}
