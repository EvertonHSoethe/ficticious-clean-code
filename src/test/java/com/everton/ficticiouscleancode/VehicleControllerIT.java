package com.everton.ficticiouscleancode;

import com.everton.ficticiouscleancode.controller.dto.VehicleCreateDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;
import java.time.LocalDateTime;

import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class VehicleControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenCreateVehicleThenReturnVehicle() throws Exception {
        URI uri = new URI("/vehicle");
        VehicleCreateDTO vehicleCreateDTO = new VehicleCreateDTO();
        vehicleCreateDTO.setName("Sandero");
        vehicleCreateDTO.setModel("GT LINE");
        vehicleCreateDTO.setManufacturingDate(LocalDateTime.now());
        vehicleCreateDTO.setManufacturer("Renault");
        vehicleCreateDTO.setConsumePerKmInCity(10.5);
        vehicleCreateDTO.setConsumePerKmInRoad(13.5);

        mockMvc.perform(MockMvcRequestBuilders
                .post(uri)
                .content(vehicleCreateDTO.toJson())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.manufacturer", equalTo(vehicleCreateDTO.getManufacturer())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", equalTo(vehicleCreateDTO.getName())));
    }
}
