package com.everton.ficticiouscleancode.controller;

import com.everton.ficticiouscleancode.controller.dto.CostPerVehicleResponseDTO;
import com.everton.ficticiouscleancode.service.CostCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cost")
public class CostController {

    @Autowired
    private CostCalculationService costCalculationService;

    @GetMapping
    public Page<CostPerVehicleResponseDTO> costCalculation(@RequestParam Double gasolinePrice,
                                                           @RequestParam Double totalKmCity,
                                                           @RequestParam Double totalKmRoad,
                                                           @PageableDefault Pageable pagination
    ) {

        return costCalculationService.calculate(gasolinePrice, totalKmCity, totalKmRoad, pagination);
    }
}
