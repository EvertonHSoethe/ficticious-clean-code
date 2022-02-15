package com.everton.ficticiouscleancode.repository;

import com.everton.ficticiouscleancode.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Optional<Vehicle> findByName(String name);
    Optional<Vehicle> findByModel(String model);
}
