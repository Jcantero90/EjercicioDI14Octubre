package com.example.ExamenJesus.demo.examen.controller;

import com.example.ExamenJesus.demo.examen.model.Vehicle;
import com.example.ExamenJesus.demo.examen.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Hecho.
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    ServiceRegistry serviceRegistry;

    @PostMapping("/postVehicle")
    public void processStudentDetails(@RequestBody Vehicle vehicle){
        serviceRegistry.getService(vehicle.getVehicleType()).process(vehicle);
    }

}
