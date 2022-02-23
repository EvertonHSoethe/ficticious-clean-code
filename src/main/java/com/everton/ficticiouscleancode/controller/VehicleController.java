package com.everton.ficticiouscleancode.controller;

import com.everton.ficticiouscleancode.controller.dto.VehicleCreateDTO;
import com.everton.ficticiouscleancode.controller.dto.VehicleResponseDTO;
import com.everton.ficticiouscleancode.controller.mapper.VehicleMapper;
import com.everton.ficticiouscleancode.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    @Transactional
    public ResponseEntity<VehicleResponseDTO> createVehicle(@RequestBody @Valid VehicleCreateDTO vehicle, UriComponentsBuilder uriBuilder) {
        var vehicleSaved = vehicleService.save(VehicleMapper.createDTOToVehicle(vehicle));
        var uri = uriBuilder.path("/vehicle/{id}").buildAndExpand(vehicleSaved.getId()).toUri();
        return ResponseEntity.created(uri).body(VehicleMapper.entityToResponseDTO(vehicleSaved));
    }

//    @PostMapping
//    @Transactional
//    @RequestMapping("/test")
//    public ResponseEntity<VehicleResponseDTO> createVehicleTest(@RequestBody @Valid VehicleCreateDTO vehicle) {
//        var vehicleSaved = vehicleService.save(VehicleMapper.createDTOToVehicle(vehicle));
//        return ResponseEntity.ok(VehicleMapper.entityToResponseDTO(vehicleSaved));
//    }
}