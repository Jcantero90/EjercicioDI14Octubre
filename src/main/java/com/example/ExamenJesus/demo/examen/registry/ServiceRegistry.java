package com.example.ExamenJesus.demo.examen.registry;
//Hecho.
public interface ServiceRegistry {
    public <T> AdapterService<T> getService(String serviceName);
}
