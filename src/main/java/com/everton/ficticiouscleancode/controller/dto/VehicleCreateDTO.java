package com.everton.ficticiouscleancode.controller.dto;

import com.everton.ficticiouscleancode.model.Vehicle;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class VehicleCreateDTO {

    @NotBlank
    private String name;
    @NotNull
    private String manufacturer;
    @NotNull
    private String model;
    @NotNull
    private Date manufacturingDate;
    @NotNull
    private Double consumePerKmInCity;
    @NotNull
    private Double consumePerKmInRoad;

    public VehicleCreateDTO(){

    }

    public VehicleCreateDTO(Vehicle vehicle) {
        this.name = vehicle.getName();
        this.manufacturer = vehicle.getManufacturer();
        this.model = vehicle.getModel();
        this.manufacturingDate = vehicle.getManufacturingDate();
        this.consumePerKmInCity = vehicle.getConsumePerKmInCity();
        this.consumePerKmInRoad = vehicle.getConsumePerKmInRoad();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Double getConsumePerKmInCity() {
        return consumePerKmInCity;
    }

    public void setConsumePerKmInCity(Double consumePerKmInCity) {
        this.consumePerKmInCity = consumePerKmInCity;
    }

    public Double getConsumePerKmInRoad() {
        return consumePerKmInRoad;
    }

    public void setConsumePerKmInRoad(Double consumePerKmInRoad) {
        this.consumePerKmInRoad = consumePerKmInRoad;
    }
}
