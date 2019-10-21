package com.example.serverprovider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proController")
public class ProController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/getPort")
    public String home() {
//        int a=1/0;
        return "Hello world ,port:" + port;
    }
}
