package com.everton.ficticiouscleancode.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id) && Objects.equals(name, vehicle.name) && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model) && Objects.equals(manufacturingDate, vehicle.manufacturingDate) && Objects.equals(consumePerKmInCity, vehicle.consumePerKmInCity) && Objects.equals(consumePerKmInRoad, vehicle.consumePerKmInRoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, model, manufacturingDate, consumePerKmInCity, consumePerKmInRoad);
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
}
