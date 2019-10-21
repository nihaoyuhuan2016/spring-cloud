package com.example.serverconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

        @Autowired
        private RestTemplate restTemplate;

        @GetMapping(value = "/hello")
        public String hello() {
                //访问路径：http://注册中心服务名/方法路径
            return restTemplate.getForEntity("http://server-provider/proController/getPort", String.class).getBody();
        }
}
