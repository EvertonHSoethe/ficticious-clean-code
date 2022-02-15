package com.everton.ficticiouscleancode.controller.dto;

import java.util.Date;

public class CostPerVehicleResponseDTO {

    private String name;
    private String manufacturer;
    private String model;
    private Date manufacturingDate;
    private Double consumedFuel;
    private Double totalFuelCost;

    public CostPerVehicleResponseDTO(){

    }

    public CostPerVehicleResponseDTO(String name, String manufacturer, String model, Date manufacturingDate, Double consumedFuel, Double totalFuelCost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.consumedFuel = consumedFuel;
        this.totalFuelCost = totalFuelCost;
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

    public Double getConsumedFuel() {
        return consumedFuel;
    }

    public void setConsumedFuel(Double consumedFuel) {
        this.consumedFuel = consumedFuel;
    }

    public Double getTotalFuelCost() {
        return totalFuelCost;
    }

    public void setTotalFuelCost(Double totalFuelCost) {
        this.totalFuelCost = totalFuelCost;
    }
}
