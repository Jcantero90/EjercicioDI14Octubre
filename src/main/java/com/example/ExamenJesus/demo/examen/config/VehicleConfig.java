package com.example.ExamenJesus.demo.examen.config;

import com.example.ExamenJesus.demo.examen.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Hecho
@Configuration
public class VehicleConfig {

    @Bean
    public FactoryBean<?> factoryBean(){
        final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(ServiceRegistry.class);
        return bean;
    }
}
