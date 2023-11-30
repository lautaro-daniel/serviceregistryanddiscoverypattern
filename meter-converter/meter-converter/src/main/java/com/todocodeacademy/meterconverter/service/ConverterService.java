package com.todocodeacademy.meterconverter.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService{

    @Override
    public Double convertMetersToCentimeters(Double meters) {
        return meters*100;
    }
}
