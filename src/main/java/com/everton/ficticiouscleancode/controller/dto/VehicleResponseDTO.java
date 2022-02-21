package com.everton.ficticiouscleancode.controller.dto;

import com.everton.ficticiouscleancode.model.Vehicle;

import java.util.Date;

public class VehicleResponseDTO {

    private Long id;

    private String name;

    private String manufacturer;

    private String model;

    private Date manufacturingDate;

    private Double consumePerKmInCity;

    private Double consumePerKmInRoad;

    public VehicleResponseDTO(){

    }

    public VehicleResponseDTO(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.name = vehicle.getName();
        this.manufacturer = vehicle.getManufacturer();
        this.model = vehicle.getModel();
        this.manufacturingDate = vehicle.getManufacturingDate();
        this.consumePerKmInCity = vehicle.getConsumePerKmInCity();
        this.consumePerKmInRoad = vehicle.getConsumePerKmInRoad();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
