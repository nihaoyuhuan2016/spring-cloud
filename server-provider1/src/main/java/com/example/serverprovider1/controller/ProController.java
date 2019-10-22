package com.example.serverprovider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("/proController")
public class ProController {
    @Value("${server.port}")
    String port;
    @Value("${content}")
    String content;
    @RequestMapping("/getPort")
    public String home() {
//        int a=1/0;
        return "port:" + port+"   properties:"+content;
    }
}
