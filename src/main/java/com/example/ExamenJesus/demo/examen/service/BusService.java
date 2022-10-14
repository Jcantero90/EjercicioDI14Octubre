package com.example.ExamenJesus.demo.examen.service;

import com.example.ExamenJesus.demo.examen.model.Vehicle;
import com.example.ExamenJesus.demo.examen.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Bus")
public class BusService implements AdapterService<Vehicle> {
    @Override
    public void process(Vehicle request) {
        System.out.println("Inside bus service - " + request.toString());
    }
}
