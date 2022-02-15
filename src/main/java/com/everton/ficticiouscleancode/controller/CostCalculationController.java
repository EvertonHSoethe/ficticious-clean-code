package com.everton.ficticiouscleancode.controller;

import com.everton.ficticiouscleancode.controller.dto.CostPerVehicleResponseDTO;
import com.everton.ficticiouscleancode.service.CostCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/costCalculation")
public class CostCalculationController {

    @Autowired
    private CostCalculationService costCalculationService;

    @GetMapping
    public List<CostPerVehicleResponseDTO> costCalculation(@RequestParam Double gasolinePrice,
                                                           @RequestParam Double totalKmCity,
                                                           @RequestParam Double totalKmRoad,
                                                           @PageableDefault(page = 0, size = 10)
                                                     Pageable pagination
    ) {

        return costCalculationService.calculate(gasolinePrice, totalKmCity, totalKmRoad);
    }
}
