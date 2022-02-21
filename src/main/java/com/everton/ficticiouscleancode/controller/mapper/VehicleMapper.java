package com.everton.ficticiouscleancode.controller.mapper;

import com.everton.ficticiouscleancode.controller.dto.VehicleCreateDTO;
import com.everton.ficticiouscleancode.controller.dto.VehicleResponseDTO;
import com.everton.ficticiouscleancode.model.Vehicle;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;

public class VehicleMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    private static TypeMap<VehicleCreateDTO, Vehicle> typeMapCreateDTOToEntity;
    private static TypeMap<Vehicle, VehicleResponseDTO> typeMapEntityToResponseDTO;

    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        typeMapCreateDTOToEntity = modelMapper.createTypeMap(VehicleCreateDTO.class, Vehicle.class);
        typeMapEntityToResponseDTO = modelMapper.createTypeMap(Vehicle.class, VehicleResponseDTO.class);
    }

    public static VehicleResponseDTO entityToResponseDTO(Vehicle vehicle) {
        return modelMapper.map(vehicle, VehicleResponseDTO.class);
    }

    public static Vehicle createDTOToVehicle(VehicleCreateDTO vehicleCreateDTO) {
        return modelMapper.map(vehicleCreateDTO, Vehicle.class);
    }
}
