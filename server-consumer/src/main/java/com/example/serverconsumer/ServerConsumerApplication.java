package com.example.serverconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class ServerConsumerApplication {
    //使用RestTemplate的方式实现带负载均衡的消费者
    @LoadBalanced //该注解表明这个restRemplate开启负载均衡的功能。
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class, args);

    }


}
