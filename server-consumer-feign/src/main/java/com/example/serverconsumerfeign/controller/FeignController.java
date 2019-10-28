package com.example.serverconsumerfeign.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("byFeign")
public class FeignController{
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private FeignService feignService;
//    @Override
    @RequestMapping("getPort")
    @HystrixCommand(fallbackMethod = "getPortFallback")
    public String getPort2222() {
        logger.info("进入主服务方法");
        return feignService.getPort();
    }

    public String getPortFallback(){
        return "\"主服务异常，进入备用方法\"";
    }
}
