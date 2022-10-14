package com.example.ExamenJesus.demo.examen.service;

import com.example.ExamenJesus.demo.examen.model.Vehicle;
import com.example.ExamenJesus.demo.examen.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Car")
public class CarService implements AdapterService<Vehicle> {
    @Override
    public void process(Vehicle request) {
        System.out.println("Inside car service - " + request.toString());
    }
}
