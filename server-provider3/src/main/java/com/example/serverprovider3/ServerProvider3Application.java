package com.example.serverprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerProvider3Application.class, args);
    }

}
