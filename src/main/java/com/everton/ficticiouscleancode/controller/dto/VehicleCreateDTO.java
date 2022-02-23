package com.everton.ficticiouscleancode.controller.dto;

import com.everton.ficticiouscleancode.model.Vehicle;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.time.LocalDateTime;

public class VehicleCreateDTO {

    @NotBlank
    private String name;
    @NotNull
    private String manufacturer;
    @NotNull
    private String model;
    @NotNull
    private LocalDateTime manufacturingDate;
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

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
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

    @Override
    public String toString() {
        return "VehicleCreateDTO{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", consumePerKmInCity=" + consumePerKmInCity +
                ", consumePerKmInRoad=" + consumePerKmInRoad +
                '}';
    }

    public String toJson() throws ParseException {
        return "{" +
                "\"name\":\"" + name + "\"" +
                ", \"manufacturer\":\"" + manufacturer + "\"" +
                ", \"model\":\"" + model + "\"" +
                ", \"manufacturingDate\":\"" + manufacturingDate + "\"" +
                ", \"consumePerKmInCity\":\"" + consumePerKmInCity + "\"" +
                ", \"consumePerKmInRoad\":\"" + consumePerKmInRoad + "\"" +
                '}';
    }
}
