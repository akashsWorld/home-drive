package com.homedrive.service_registry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryMain {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryMain.class, args);
    }
}