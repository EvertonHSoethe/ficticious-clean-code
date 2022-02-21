package com.everton.ficticiouscleancode.service;

import com.everton.ficticiouscleancode.model.Vehicle;
import com.everton.ficticiouscleancode.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle save(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
}
