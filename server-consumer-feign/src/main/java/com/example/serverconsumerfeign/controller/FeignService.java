package com.example.serverconsumerfeign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 艾特FeignClient("server-provider") 该注解中的字符串是要调用的微服务在eureka注册中心中的名称
 */
@FeignClient("server-provider")
public interface FeignService {
    @RequestMapping("/proController/getPort")
    public String getPort();
}
