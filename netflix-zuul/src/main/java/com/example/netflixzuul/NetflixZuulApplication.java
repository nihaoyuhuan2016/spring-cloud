package com.example.netflixzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class NetflixZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulApplication.class, args);
    }

}
