package com.everton.ficticiouscleancode.service;

import com.everton.ficticiouscleancode.controller.dto.CostPerVehicleResponseDTO;
import com.everton.ficticiouscleancode.model.Vehicle;
import com.everton.ficticiouscleancode.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CostCalculationService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Page<CostPerVehicleResponseDTO> calculate(Double gasolinePrice,
                                                     Double totalKmCity,
                                                     Double totalKmRoad,
                                                     Pageable pagination){
        Page<Vehicle> vehicleList = vehicleRepository.findAll(pagination);
        List<CostPerVehicleResponseDTO> listCost = new ArrayList<>();
        vehicleList.stream().forEach(vehicle -> {
            var consumedFuel = (totalKmCity/vehicle.getConsumePerKmInCity())+(totalKmRoad/vehicle.getConsumePerKmInRoad());
            var totalFuelCost = consumedFuel*gasolinePrice;
            listCost.add(new CostPerVehicleResponseDTO(vehicle.getName(),vehicle.getManufacturer(),
                    vehicle.getModel(),vehicle.getManufacturingDate(),consumedFuel,totalFuelCost));
        });


        return new PageImpl(listCost.stream().sorted(Comparator.comparing(CostPerVehicleResponseDTO::getTotalFuelCost)).collect(Collectors.toList()),
                pagination,
                listCost.size());
    }
}
