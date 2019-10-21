package com.example.serverprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerProvider1Application {
    public static void main(String[] args) {
        SpringApplication.run(ServerProvider1Application.class, args);
    }

}
