package com.example.netflixzuulfilter;

import com.example.netflixzuulfilter.zuulfilters.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulFilterApplication {
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulFilterApplication.class, args);
    }

}
