package com.example.serverprovider1.controller;

import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("/proController")
public class ProController {
    private final Logger logger = Logger.getLogger(getClass());
    @Value("${server.port}")
    String port;
    @Value("${content}")
    String content;
    @RequestMapping("/getPort")
    public String home() {
        logger.info("链路追踪测试，provider1");
        int a=1/0;
        return "port:" + port+"   properties:"+content;
    }
}
