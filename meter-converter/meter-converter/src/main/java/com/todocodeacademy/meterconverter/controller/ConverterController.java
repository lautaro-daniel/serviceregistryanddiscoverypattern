package com.todocodeacademy.meterconverter.controller;

import com.todocodeacademy.meterconverter.service.IConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {

    @Autowired
    IConverterService iConverterService;

    @GetMapping("meters/{meters}")
    public String convertMetersToCentimeters(@PathVariable Double meters){

        return meters + " Meters to centimeters = " + iConverterService.convertMetersToCentimeters(meters);
    }
}
